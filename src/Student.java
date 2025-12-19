public class Student {
    private String name;
    private String id;
    private String major;
    private double gpa;
    private int credits;

    public Student(String name, String id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = 0.0;
        this.credits = 0;
    }
    public String getName() { return name; }
    public String getId() { return id; }
    public String getMajor() { return major; }
    public double getGpa() { return gpa; }
    public int getCredits() { return credits; }

    public void setName(String name) { this.name = name; }
    public void setId(String id) { this.id = id; }
    public void setMajor(String major) { this.major = major; }
    public void setGpa(double gpa) { this.gpa = gpa; }
    public void setCredits(int credits) { this.credits = credits; }

    public void addCredits(int c) {
        if (c > 0) {
            this.credits += c;
        }
    }
    public void updateGPA(double newGPA) {
        if (newGPA >= 0.0 && newGPA <= 4.0) {
            this.gpa = newGPA;
        }
    }
    public boolean isHonors() {
        return gpa >= 3.5;
    }
    @Override
    public String toString() {
        return "Student{name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", major='" + major + '\'' +
                ", gpa=" + gpa +
                ", credits=" + credits +
                '}';
    }
}
