//CLASS UTAMA YANG BERISI FIELD SERTA METHOD
package Evaluasi1;
class MembuatFieldDanMethod {

    String namaPendek;
    String namaPanjang;
    char jenisKelammin;
    int umur;
    double berat;
    String alamat;
  
    void identitas(String namaPendek, String namaPanjang, char jenisKelamin, int umur, double berat, String alamat) {
        this.namaPanjang = namaPanjang;
        this.namaPendek = namaPendek;
        this.jenisKelammin = jenisKelamin;
        this.umur = umur;
        this.berat = berat;
        this.alamat = alamat;
    }
}
//CLASS CABANG YANG BERISI DATA CLASS UTAMA
class Constructor extends MembuatFieldDanMethod {
    Constructor(String namaPanjang, String namaPendek) {
        this.namaPanjang = namaPanjang;
        this.namaPendek = namaPendek;
    }
}
// CLASS CABANG UNTUK MENGAKSES CONSTRUCTOR DALAM CLASS DI ATAS INI

import java.util.Scanner;

public class NewClass extends Constructor{

    NewClass(String namapnj, String namapnd) {
        super(namapnj, namapnd);
        System.out.println(super.namaPendek + " " + super.namaPanjang);
    } 
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NewClass nama = new NewClass("ALDO", "SAPUTRA");        
    }
}
