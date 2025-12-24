
public class VariableShadowing {

    String nama;
    String NIM;
    int umur;
    
    void sayhello(String nama,String NIM, int umur){
        this.nama = nama;
        this.NIM = NIM;
        this.umur = umur;
        System.out.println(this.nama);
        System.out.println(this.NIM);
        System.out.println(this.umur);
    }

    VariableShadowing(String nama, String NIM, int umur) {
        this.sayhello(nama, NIM, umur);
    }
    public static void main(String[] args) {
        var identitas = new VariableShadowing("Aldo Saputra","D0225326", 19);
        System.out.println("");
        identitas.sayhello("Aldo", "D0225236", 19);
      
    }
}
