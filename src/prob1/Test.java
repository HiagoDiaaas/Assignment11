package prob1;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>(Arrays.asList(
            new Student("Joe", "Smith", 3.2, Standing.FRESHMAN),
            new Student("Tom", "Rogers", 3.5, Standing.SENIOR),
            new Student("HeLing", "Wu", 2.9, Standing.JUNIOR),
            new Student("Pierre", "Fromage", 2.8, Standing.FRESHMAN),
            new Student("Ihaku", "Tamataku", 3.9, Standing.JUNIOR),
            new Student("Richard", "Wong", 2.8, Standing.SOPHOMORE)
        ));

        HashMap<Key, Student> map = Admin.processStudents(list);
        double ave = Admin.computeAverageGPA(map);
        System.out.println("Average GPA : " + ave);
    }
}
