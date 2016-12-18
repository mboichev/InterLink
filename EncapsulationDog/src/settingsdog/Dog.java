package settingsdog;

public class Dog {

    //Скрытые свойства объекта
    private String name;
    private String breed;
    private int age;

    public void Say() {
        System.out.println("Gav");
    }
    //С помощь методов установки и получения можно использовать свойства объекта

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog[Name: " + name + ", Breed: " + breed + ", Age: " + age + "]";
    }
}
