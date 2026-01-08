import java.util.Scanner;
//Day02

class OOP2 {
    int panjang;
    int lebar;
    int hasil;
    void luas(){
        hasil = panjang * lebar;
        System.out.println(hasil);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OOP2 luasperpanjang = new OOP2();
        luasperpanjang.panjang = input.nextInt();
        luasperpanjang.lebar = input.nextInt();
        luasperpanjang.luas();
        
    }

}
