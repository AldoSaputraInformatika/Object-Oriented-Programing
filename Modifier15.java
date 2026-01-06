//Class A
package AccestModifier;

public class Nilai {

    public String username;
    private String password;
    protected String num;
    String country;    
}
//Class B
package AccestModifier;

import AccestModifier.Nilai;

public class Siswa {

    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        System.out.println(nilai.country = "indonesia");
        System.out.println(nilai.num = "082");
        System.out.println(nilai.username = "Aldo");
    }
}

