//Class Pribadi
package Imports.code2;

public class Pribadi {

    public String nama;
    public String jeniskel;
    public String nomor;
    public int umur;
    public double berat;

    public Pribadi(String nama, String jeniskel, String nomor, int umur, double berat) {
        this.nama = nama;
        this.jeniskel = jeniskel;
        this.nomor = nomor;
        this.umur = umur;
        this.berat = berat;
        System.out.println("Nama Lengkap    : " + this.nama);
        System.out.println("Jenis Kelamin   : " + this.jeniskel);
        System.out.println("Nomor Telepon   : " + this.nomor);
        System.out.println("Umur            : " + this.umur);
        System.out.println("Berat Badan     : " + this.berat);
    }

}
//Class Lingkungan
package Imports.code1;

public class Lingkungan {

    public String kecamatan;
    public String kabupaten;
    public String provinsi;

    public Lingkungan(String kec, String kab, String prov) {
        kecamatan = kec;
        kabupaten = kab;
        provinsi = prov;
        System.out.println("Kecamatan   : " + kecamatan);
        System.out.println("Kabupaten   : " + kabupaten);
        System.out.println("Provinsi    : " + provinsi);
    }

}
//ClassAPP
package Imports;

import Imports.code1.Lingkungan;
import Imports.code2.Pribadi;
import java.util.Scanner;

public class Identitas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a, b, c;
        System.out.print("Masukkan kecamatan kamu: ");
        a = input.nextLine();
        System.out.print("Masukkan kabupaten kamu: ");
        b = input.nextLine();
        System.out.print("Masukkan provinsi kamu: ");
        c = input.nextLine();
        Lingkungan lingkungan = new Lingkungan(a, b, c);
        Pribadi prbadi = new Pribadi("Aldo Saputra", "Laki Laki", "081328313517", 19, 72);

    }
}
