//Super keyword digunakan untuk mengakses parens class atau class utama dari beberapa cabang yang telah dibuat
package oop;
//Clas Utama
class utama {
    String restoran;
    String menu;
    int harga;
    void pesanan(String restoran, String menu, int harga){
       this.restoran = restoran;
       this.menu = menu;
       this.harga = harga;
    }
}
//Class Cabang
package oop;
class cabang extends utama{
    void pesanan(String restoran, String menu, int harga){
        this.restoran = menu;
        this.menu = restoran;
        this.harga = harga;
      
    }
    void pesananlama(){
        super.pesanan(super.restoran, super.menu, super.harga);
        System.out.println(this.restoran);
        System.out.println(this.menu);
        System.out.println(this.harga);
    }
    
}
//Class Eksekusi
package oop;

import java.util.Scanner;

class Jalanin {

    public static void main(String[] args) {

        var utama = new utama();
        String a, b;
        int c;
        Scanner input = new Scanner(System.in);
        a = input.nextLine();
        b = input.nextLine();
        c = input.nextInt();
        utama.pesanan(a, b, c);
        System.out.println("Nama restoran: " + utama.restoran);
        System.out.println("Nama menu: " + utama.menu);
        System.out.println("Haga makanan :" + utama.harga);
        System.out.println("");
        var cabang = new cabang();
        cabang.pesanan(a, b, c);
        System.out.println("Nama restoran: " + cabang.restoran);
        System.out.println("Nama menu: " + cabang.menu);
        System.out.println("Haga makanan :" + cabang.harga);
        System.out.println("");
        cabang.pesananlama();
    }
}

