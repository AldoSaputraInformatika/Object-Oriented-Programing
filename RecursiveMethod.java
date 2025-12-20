
import java.util.Scanner;

public class Soal9 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(gatau(x));
        
    }

    static int gatau(int nilai) {
        
        if (nilai == 1) {
            return 1;
        } else {
            
            return nilai *= gatau(nilai - 1);
            
        }
    }
    
}
