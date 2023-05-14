import java.util.ArrayList;
import java.util.List;
class UniversitySystem {
    private List<Student> students;

    public UniversitySystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public List<Student> searchStudentsByUniversity(String university) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getUniversity().equals(university)) {
                result.add(student);
            }
        }
        return result;
    }
}