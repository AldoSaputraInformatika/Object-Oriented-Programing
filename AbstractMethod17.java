//Class Utama (abstract)
// Day17
package AbstractMethod;

public abstract class Animal {
    String name;
    abstract  void dog();
    
}
//Subclass override
package AbstractMethod;

public class Dog extends Animal{
    void dog(){
        System.out.println("This dog name is " + name);
    }
}
//Class App
package AbstractMethod;

public class AnimalApp {

    public static void main(String[] args) {

        Animal animal = new Dog();
        animal.name = "Blacky";
        animal.dog();
    }

}
