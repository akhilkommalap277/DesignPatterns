package FilterDesignPattern;

public class Person {

    String name;

    public Person(String name, String gender, String martialStatus) {
        this.name = name;
        this.gender = gender;
        this.martialStatus = martialStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMartialStatus() {
        return martialStatus;
    }

    String gender;
    String martialStatus;

}
