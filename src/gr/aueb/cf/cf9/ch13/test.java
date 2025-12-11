package gr.aueb.cf.cf9.ch13;

import java.io.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.*;
import java.lang.reflect.Method;

class AutoPDFRenameFolder {

    public static void renameAllPDFs(String folderPath) throws Exception {
        String PDFBOX_URL = "https://repo1.maven.org/maven2/org/apache/pdfbox/pdfbox-app/2.0.30/pdfbox-app-2.0.30.jar";
        String PDFBOX_LOCAL = "pdfbox-app-2.0.30.jar";

        // Κατεβάζουμε το PDFBox αν δεν υπάρχει
        Path jarPath = Path.of(PDFBOX_LOCAL);
        if (!Files.exists(jarPath)) {
            System.out.println("Κατεβάζω PDFBox...");
            try (InputStream in = new URL(PDFBOX_URL).openStream()) {
                Files.copy(in, jarPath, StandardCopyOption.REPLACE_EXISTING);
            }
            System.out.println("PDFBox κατεβηκε.");
        }

        // Φορτώνουμε το jar δυναμικά
        URL jarUrl = jarPath.toUri().toURL();
        URLClassLoader loader = new URLClassLoader(new URL[]{jarUrl}, AutoPDFRenameFolder.class.getClassLoader());

        Class<?> pdDocumentClass = loader.loadClass("org.apache.pdfbox.pdmodel.PDDocument");
        Class<?> pdfStripperClass = loader.loadClass("org.apache.pdfbox.text.PDFTextStripper");

        Method loadMethod = pdDocumentClass.getMethod("load", File.class);
        Method closeMethod = pdDocumentClass.getMethod("close");
        Method getTextMethod = pdfStripperClass.getMethod("getText", pdDocumentClass);

        // Φάκελος με PDF
        File folder = new File(folderPath);
        File[] files = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".pdf"));

        if (files == null || files.length == 0) {
            System.out.println("Δεν βρέθηκαν PDF στον φάκελο: " + folderPath);
            return;
        }

        for (File pdfFile : files) {
            try {
                Object document = loadMethod.invoke(null, pdfFile);
                Object stripper = pdfStripperClass.getConstructor().newInstance();
                String text = (String) getTextMethod.invoke(stripper, document);
                closeMethod.invoke(document);

                // Βρίσκουμε τη γραμμή κάτω από SAP
                String[] lines = text.split("\\r?\\n");
                String newName = null;

                for (int i = 0; i < lines.length; i++) {
                    if (lines[i].contains("SAP") && i + 1 < lines.length) {
                        String lineBelow = lines[i + 1].trim();
                        if (!lineBelow.isEmpty()) {
                            // Καθαρίζουμε τη γραμμή από μη έγκυρους χαρακτήρες
                            newName = lineBelow.replaceAll("[^a-zA-Z0-9_\\-]", "_");
                        }
                        break;
                    }
                }

                if (newName != null && !newName.isEmpty()) {
                    Path source = pdfFile.toPath();
                    Path target = source.resolveSibling(newName + ".pdf");
                    Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
                    System.out.println(pdfFile.getName() + " -> " + newName + ".pdf");
                } else {
                    System.out.println("Δεν βρέθηκε γραμμή κάτω από 'SAP' για: " + pdfFile.getName());
                }

            } catch (Exception e) {
                System.out.println("Σφάλμα με το αρχείο: " + pdfFile.getName());
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            String folderPath = "C:\\Users\\Admin\\Desktop\\RENAME";
            renameAllPDFs(folderPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}