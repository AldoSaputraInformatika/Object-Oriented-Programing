public class ConstructorOverloading {
    String longname;
    String jeniskelamin;
    String panjangnama;
    

    ConstructorOverloading() {
        longname = "Aldo Saputra";
        jeniskelamin = "Laki laki";
        
    }

    ConstructorOverloading(String name, String jk) {
       
        panjangnama = name;
        jeniskelamin = jk;
        
    }
    public static void main(String[] args) {
        ConstructorOverloading identitas = new ConstructorOverloading();
        ConstructorOverloading identitas2 = new ConstructorOverloading("Aldo Saputra", "Laki Laki");
        System.out.println(identitas.longname);
        System.out.println(identitas.jeniskelamin);
        System.out.println("");
        System.out.println(identitas2.panjangnama);
        System.out.println(identitas2.jeniskelamin);
    }

}
