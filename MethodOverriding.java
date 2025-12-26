//ALDO
public class Inheritance {

    String warna;
    String merek;
    String harga;

    void Inheritance(String warna, String merek, String harga) {
        this.warna = warna;
        this.merek = merek;
        this.harga = harga;
       
    }

}

class Chile extends Inheritance {
    
    void Inheritance(String warna, String merek, String harga){
        this.warna = warna;
        this.merek = merek;
        this.harga = harga;
        for (int i = 1; i <= 3; i++) {
            System.out.println(this.harga);
            System.out.println(this.merek);
            System.out.println(this.warna);
        }
    }
    
    public static void main(String[] args) {
        var cars = new Chile();
        
    }
}

class ChildClass extends Inheritance{
    public static void main(String[] args) {
        var cars = new ChildClass();
        cars.Inheritance("merah", "totoya", "Rp.700000000");
        System.out.println(cars.harga);
        System.out.println(cars.warna);
        System.out.println(cars.merek);
        
        var cars2 = new Chile();
        cars2.Inheritance("Kuning", "Samsung", "Rp.800000000");
    }
}
