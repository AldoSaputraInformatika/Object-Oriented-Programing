//Parents Class
package ObjectClass;
class ClassParens {
    String nama;
    String anjing(String nama) {
        this.nama = nama;
        return "Nama Anjing " + nama;
    }
}
//Child Class
class ClassChild extends ClassParens {
    //Overiding
    String anjing(String nama) {
        this.nama = nama;
        return "Nama anjingmu ini adalah " + nama;
    }
}
//Running Program
import java.util.Scanner;
public class RunningProgram {
    public static void main(String[] args) {
        ClassChild identyf = new ClassChild();
        String nama = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama Anjing: ");
        nama = input.nextLine();
        System.out.println(identyf.anjing(nama));
        System.out.println("");
        ClassParens identyf2 = new ClassParens();
        System.out.print("Masukkan nama Anjing (2): ");
        nama = input.nextLine();
        System.out.println(identyf2.anjing(nama));
    }
}
