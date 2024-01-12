public class Student extends Person {
    /** Attribute*/
    String className;

    /** Constructor */
    public Student(String name, int persNo, String className){
        super(name.persNo);
        this.className = className;
    }

    public void changeClass(String className){
        this.className = className;
    }
}



