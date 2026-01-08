//Class Utama
//Day12

package TipeCheckDanCasts;

class ClassUtama {
   String nama;
   void sayHello(String nama){
       this.nama = nama;
       System.out.println("Halo CU " + this.nama  );
   }
   
}
//Class Cabang
class ClassCabang extends ClassUtama {

    void sayHello(String nama) {
        this.nama = nama;
        System.out.println("Halo CC " + this.nama);
    }
}
//Class Cabang2
class ClassCabang2 extends ClassCabang {

    void sayHello(String nama) {
        this.nama = nama;
        System.out.println("Halo CC2 " + this.nama);
    }
}
//ClassApp
public class ClassApp {

    public static void main(String[] args) {
        ClassUtama CU = new ClassUtama();
        ClassCabang CC = new ClassCabang();
        ClassCabang2 CC2 = new ClassCabang2();
        if(CC2 instanceof ClassUtama){
           ClassUtama CC4 = (ClassUtama) CC2;
           CC4.sayHello("Aldo");
        }
        
        if(CC instanceof ClassUtama){
            ClassUtama CC3 = (ClassUtama) CC;
            CC3.sayHello("Aldo");
        }

    }
}
