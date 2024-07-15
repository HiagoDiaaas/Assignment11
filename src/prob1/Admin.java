package prob1;
import java.util.*;
public class Admin {
    public static HashMap<Key, Student> processStudents(List<Student> students) {
        HashMap<Key, Student> studentMap = new HashMap<>();
        for (Student student : students) {
            Key key = new Key(student.getFirstName(), student.getLastName());
            studentMap.put(key, student);
        }
        return studentMap;
    }

    public static double computeAverageGPA(HashMap<Key,Student> maps) {
        if (maps.isEmpty()) return 0.0;
        double totalGpa = 0;
        for (Student student : maps.values()) {
            totalGpa += student.getGpa();
        }
        return totalGpa / maps.size();
    }
}
