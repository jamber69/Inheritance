import java.util.ArrayList;

public class Teacher extends Person {
    /** Attribute */
    ArrayList<String> courses = new ArrayList<>();

    /** Constructor */
    public Teacher(String name, int persNo){
    }

    public void addCourse(String course){
        courses.add(course);
    }
}
