import java.util.List;

public class Program {
    public static void main(String[] args) {
        UniversitySystem universitySystem = new UniversitySystem();

        Student student1 = new Student("Иванов Иван", 20, "Университет 1", "Информатика");
        universitySystem.addStudent(student1);

        Student student2 = new Student("Петров Петр", 21, "Университет 2", "Экономика");
        universitySystem.addStudent(student2);

        Student student3 = new Student("Сидорова Анна", 19, "Университет 1", "Медицина");
        universitySystem.addStudent(student3);

        List<Student> allStudents = universitySystem.getAllStudents();
        System.out.println("Все студенты:");
        for (Student student : allStudents) {
            System.out.println("Имя: " + student.getName());
            System.out.println("Возраст: " + student.getAge());
            System.out.println("Университет: " + student.getUniversity());
            System.out.println("Специальность: " + student.getMajor());
            System.out.println();
        }

        String searchUniversity = "Университет 1";
        List<Student> studentsByUniversity = universitySystem.searchStudentsByUniversity(searchUniversity);
        System.out.println("Студенты университета " + searchUniversity + ":");
        for (Student student : studentsByUniversity) {
            System.out.println("Имя: " + student.getName());
            System.out.println("Возраст: " + student.getAge());
            System.out.println("Университет: " + student.getUniversity());
            System.out.println("Специальность: " + student.getMajor());
            System.out.println();
        }

        universitySystem.removeStudent(student2);

        allStudents = universitySystem.getAllStudents();
        System.out.println("Все студенты после удаления:");
        for (Student student : allStudents) {
            System.out.println("Имя: " + student.getName());
            System.out.println("Возраст: " + student.getAge());
            System.out.println("Университет: " + student.getUniversity());
            System.out.println("Специальность: " + student.getMajor());
            System.out.println();
        }
    }
}