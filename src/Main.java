public class Main {
    public static Student getTopStudent(Student[] arr) {
        Student best = null;
        for (Student s : arr) {
            if (s == null) continue;
            if (best == null || s.getGpa() > best.getGpa()) {
                best = s;
            }
        }
        return best;
    }
    public static int countHonors(Student[] arr) {
        int count = 0;
        for (Student s : arr) {
            if (s != null && s.isHonors()) {
                count++;
            }
        }
        return count;
    }
    public static int totalCredits(Student[] arr) {
        int sum = 0;
        for (Student s : arr) {
            if (s != null) {
                sum += s.getCredits();
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Student s1 = new Student("Ali", "S001", "CS");
        Student s2 = new Student("Aruzhan", "S002", "IT");
        Student s3 = new Student("Dana_White", "S003", "SE");
        Student s4 = new Student("Miras", "S004", "CS");
        Student s5 = new Student("Nur", "S005", "DS");
        s1.updateGPA(3.8); s1.addCredits(90);
        s2.updateGPA(3.2); s2.addCredits(75);
        s3.updateGPA(3.9); s3.addCredits(110);
        s4.updateGPA(2.7); s4.addCredits(60);
        s5.updateGPA(3.6); s5.addCredits(80);
        Student[] arr = { s1, s2, s3, s4, s5 };
        Course course = new Course("OOP", "Dr. Smith", 5);
        for (int i = 0; i < arr.length; i++) {
            course.addStudent(arr[i], i);
        }
        System.out.println("Students:");
        for (Student s : arr) {
            System.out.println(s);
        }
        System.out.println("\nCourse: " + course);
        System.out.println("Average GPA: " + course.courseAverageGPA());
        System.out.println("Highest credit student: " + course.highestCreditStudent());
        System.out.println("\nTop GPA student: " + getTopStudent(arr));
        System.out.println("Honors count: " + countHonors(arr));
        System.out.println("Total credits: " + totalCredits(arr));
    }
}
