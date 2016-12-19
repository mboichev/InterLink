
import settingsdog.Dog;
import settingsdog.People;

//Пример наследования, класс "Desiner" наследует класс "People" и множественно наследует интерфейсы "DrawingButterfly" и "DrawingDog"
public class Designer extends People implements DrawingButterfly, DrawingDog{
    private String typeDesign; //дополнительные свойства класса "Desiner", которых нет у класса "People"
    public Designer (String name, String lastName, Dog dog){
        super (name, lastName, dog); //Наследование свойств родительского класса
    }

    public String getTypeDesign() {
        return typeDesign;
    }

    public void setTypeDesign(String typeDesign) {
        this.typeDesign = typeDesign;
    }

    @Override
    public void draws() {
        System.out.println("Masterpiece");
    }
    
    //Переопределение методов наследованных интерфейсов
    @Override
        public void DrawingButterfly() {
        System.out.println("Butterfly");
    }
    @Override
       public void DrawingDog() {
        System.out.println("Dog");
    }

   
    
}

