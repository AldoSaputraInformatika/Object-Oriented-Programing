// Ketika Anda membuat objek dari kelas yang memiliki constructor, constructor tersebut akan dipanggil secara otomatis saat objek dibuat. Ini adalah bagian dari proses penciptaan objek di Java.
// Berikut langkah-langkah yang terjadi:
// Panggilan Constructor: Ketika Anda menggunakan new untuk membuat objek, Java mencari constructor yang sesuai dengan parameter yang Anda berikan.
// Inisialisasi Field: Constructor tersebut kemudian menginisialisasi nilai field (atribut) objek dengan nilai yang diberikan melalui parameter.
// Objek Siap Digunakan: Setelah constructor selesai dijalankan, objek telah siap untuk digunakan dengan nilai-nilai field yang telah diatur saat pembuatan.
class Constructor{
  String makanan;
  String minuman;
  Constructor(String namaMakanan, String namaMinuman){
    makanan = namaMakanan;
    minuman = namaMinuman;
  }
  public static void main(String[] args){
    Constructor identitas = new Constructor("Nasi Goreng" , "Cendol Dawet");
    System.out.println(identitas.makanan);
    System.out.println(identitas.minuman);
  }
}
  
