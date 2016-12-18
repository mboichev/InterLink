
import settingsdog.Dog;
import settingsdog.People;

public class Main {

    static People people;
    static Dog dog = new Dog();
    static Designer designer;

    public static void main(String[] args) {
        dog.setName("Bob");
        dog.setBreed("Drathaar");
        dog.setAge(2);

        people = new People("Ivan", "Ivanov", null);
        designer = new Designer("Masha", "Mahova", dog);
        designer.setTypeDesign("WEB");
        designer.DrawingButterfly();
        designer.DrawingDog();
    }
}
