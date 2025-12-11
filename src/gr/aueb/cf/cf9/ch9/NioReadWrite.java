package gr.aueb.cf.cf9.ch9;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * Demo of java.nio.file package.
 */
public class NioReadWrite {

    public static void main(String[] args) {
        Path source1 = Path.of("C:/Users/Admin/IdeaProjects/CF9/src/gr/aueb/cf/cf9/ch9/aueb.jpg");
        Path target1 = Path.of("C:/Users/Admin/IdeaProjects/CF9/src/gr/aueb/cf/cf9/ch9/auebNEO.jpg");
        Path source2 = Path.of("C:/PANAGOPOULOS_IOANNIS_CV.pdf/");
        Path target2 = Path.of("C:/PANAGOPOULOS_IOANNIS_CV-ΓΙΑΝΝΗΣ.pdf/");
        Path textTarget = Path.of("C:/Users/Admin/IdeaProjects/CF9/src/gr/aueb/cf/cf9/ch9/nio-hello.txt");

        try {
            textWriter(textTarget);
            textReader(textTarget);
            binaryReadWrite(source1, target1);
        } catch (IOException e) {
            System.out.println("Κάποιο λάθος συνέβη.");
        }
    }

    public static void textWriter(Path path) throws IOException {
        Files.createDirectories(path.getParent());
        Files.writeString(
                path,
                "Hello Coding",
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );
    }

    public static void textReader(Path path) throws IOException {
        String text = Files.readString(                             // Functional Programming
                path,
                StandardCharsets.UTF_8
        );
        System.out.println(text);
    }

    public static void binaryReadWrite(Path source, Path target) throws IOException {
        try (var sourceStream = Files.newInputStream(source);
             var targetStream = Files.newOutputStream(target);) {
            sourceStream.transferTo(targetStream);      // efficient, streaming σε chunks
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}