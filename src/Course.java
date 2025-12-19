public class Course {
    private String courseName;
    private String instructor;
    private Student[] students;

    public Course(String courseName, String instructor, int size) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = new Student[size];
    }
    public void addStudent(Student s, int index) {
        if (index < 0 || index >= students.length) {
            System.out.println("Index out of range");
            return;
        }
        students[index] = s;
    }
    public double courseAverageGPA() {
        double sum = 0.0;
        int count = 0;
        for (Student s : students) {
            if (s != null) {
                sum += s.getGpa();
                count++;
            }
        }
        if (count == 0) return 0.0;
        return sum / count;
    }
    public Student highestCreditStudent() {
        Student best = null;
        for (Student s : students) {
            if (s == null) continue;
            if (best == null || s.getCredits() > best.getCredits()) {
                best = s;
            }
        }
        return best;
    }
    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                '}';
    }
    public Student[] getStudents() {
        return students;
    }
}
