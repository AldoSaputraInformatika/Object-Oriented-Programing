
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
//BUAT CLASS BARU DAN SEMUA ATRIBUT DALAM CLASS DI ATAS AKAN ADA DI CLASS BAWH INI
class Chile extends Inheritance {
    public static void main(String[] args) {
        var cars = new Chile();
        cars.Inheritance("Merah", "Samsung", "Rp.200000000000");
        System.out.println(cars.harga);
    }
}
