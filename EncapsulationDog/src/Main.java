
import settingsdog.Dog;
import settingsdog.People;

public class Main {

    static Dog dog = new Dog();
    static People people = new People();

    public static void main(String[] args) {
        // Пример инкапсуляции
        //dog.name = "Bob"; - Не верное обращение к свойству "name" объекта "dog"
        //прямой доступ к свойству "name" есть только внутри класса "Dog{}"
        //это и есть пример сокрытия деталей реализации и поведения объекта от его клиентов
        dog.setName("Bob");//Пример взаимодействия с объектом
        dog.setBreed("Drathaar");
        dog.setAge(2);

        people.setName("Maksim");
        people.setLastName("Boichev");
        people.setDog(dog);
        System.out.println(dog);
        dog.Say();//объект "dog" имеет прямой доступ к методе "Say()" 
        //так-как у этого метода в классе "Dog {}" установлен модификатор доступа "public"  
        people.getDog().Say();//объект "people" не имеет прямого доступа к методу "Say()", 
        //так-как у этого метода в классе "People {}" установлен модификатор доступа "private"
        //поэтому обращатся к меду "Say()" можно через его методы установки\получения (getters and setters). 
    }
}
