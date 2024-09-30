public class Student extends Person {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student(int birthYear, String name, String id) {
        super(birthYear, name);
        this.id = id;
    }
}
