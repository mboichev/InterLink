
import settingsdog.Dog;
import settingsdog.People;

public class Main {

    static Dog dog = new Dog();
    static People people = new People();

    public static void main(String[] args) {
        dog.setName("Bob");
        dog.setBreed("drathaar");
        dog.setAge(2);

        people.setName("Maksim");
        people.setLastName("Boichev");
        people.setDog(dog);
        System.out.println(dog);
        dog.Say();
        people.getDog().Say();

    }
}
