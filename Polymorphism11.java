//Parens Class
package Polymorphism;

class ParenstClass {

    String name;

    ParenstClass(String name) {
        this.name = name;
    }

    void nama(String name) {
        System.out.println("Halo saya " + name + " apakah kamu yang bernama " + this.name);
    }

}
//ChildClass

class ChildClass extends ParenstClass {

    ChildClass(String nama) {
        super(nama);

    }

    void nama(String name) {
        System.out.println("Halo saya " + name + " apakah kamu yang bernama " + this.name + " 2 ");
    }

}
//RunningApp

public class RunningClass{
    public static void main(String[] args) {
      ParenstClass utama = new ParenstClass("Aldo");
      utama.nama(utama.name);
      utama = new ChildClass("Aldi");
      utama.nama(utama.name);
     
    }
}

