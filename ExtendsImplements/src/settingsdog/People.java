package settingsdog;

public class People {

    private String name;
    private String lastName;
    private Dog dog;

    public People(String name, String lastName, Dog dog) {
        this.name = name;
        this.lastName = lastName;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "People [Name: " + name + ", lastName: " + lastName + ", Dog: " + dog + "]";

    }
}