package gr.aueb.cf.cf9.ch15.schoolapp;

public class TeacherServiceImpl implements ITeacherService {

    @Override
    public void addTeacher(Teacher teacher) {
        System.out.println("Teacher added successfully");
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        System.out.println("Teacher updated successfully");
    }

    @Override
    public void removeTeacher(Teacher teacher) {
        System.out.println("Teacher removed successfully");
    }

    @Override
    public Teacher getTeacherByID(long id) {
        return new Teacher(1L, "Athanasios", "Androutsos");
    }

    @Override
    public Teacher[] getAllTeacher() {
        return new Teacher[] {
                new Teacher(1L, "Athanasios", "Androutsos"),
                new Teacher(2L, "Pavlos", "Koutsopoulos"),
                new Teacher(3L, "Dimitrios", "Koutsopoulos"),
                new Teacher(4L, "Georgios", "Koutsopoulos")
        };
    }
}
