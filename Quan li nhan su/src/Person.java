public class Person {
    private int  birthYear;
    private String name;

    public int getBirth() {
        return birthYear;
    }

    public String getName() {
        return name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
        this.birthYear = 1990;
        this.name = "nameless";
    }

    public Person(int birthYear, String name) {
        this.birthYear = birthYear;
        this.name = name;
    }
}
