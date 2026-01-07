//Package AbstractClass.Lokasi

package AbstractClass.Lokasi;

public abstract class Lokasii {
    public String kecamatan;
    public String kabupaten;
    public String provinsi;
}
//Package AbstractClass.Name
package AbstractClass.Name;

import AbstractClass.Lokasi.Lokasii;

public class Nama extends Lokasii {

    public String nama;
    public String nomorhp;

    public void identiti() {
        this.kabupaten = "Mamasa";
    }
}
//Package AbstractClass.App
package AbstractClass.App;
import AbstractClass.Name.Nama;
import AbstractClass.Lokasi.Lokasii;
 
public class MainApp {
    //Lokasii lokasi = new Lokasii(); > ERROR
    //Error, Abstrak class tidak dapat di buat objeknya dia hanya bisa di turunkan
    public static void main(String[] args) {
        Nama nameu = new Nama();
        System.out.println(nameu.nama);
    }
            
    
}
