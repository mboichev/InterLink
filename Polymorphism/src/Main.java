
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
        //Пример полиморфизма
        people.draws();
        designer = new Designer("Masha", "Mahova", dog);//унаследованные свойства родительского класса
        designer.setTypeDesign("WEB");
        
        //унаследованные методы интнрфейсов
        designer.DrawingButterfly();
        designer.DrawingDog();
        designer.draws();//Полиморфизм. Другая реализация унаследованноко метода "people.draws();
        
        
    }
}
