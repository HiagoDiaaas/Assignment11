package prob1;

public class Student {
    private String firstName;
    private String lastName;
    private double gpa;
    private Standing standing;

    public Student(String firstName, String lastName, double gpa, Standing standing) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.standing = standing;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "[" + firstName + " " + lastName + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return firstName.equals(student.firstName) && lastName.equals(student.lastName);
    }
}
