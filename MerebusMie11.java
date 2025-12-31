//class utama
class AkuMauMerebusMie {

    boolean nyala;
    boolean panci;
    boolean mie;
    boolean air;
    int waktu;

    boolean kompor(boolean nyala) {
        this.nyala = nyala;
        return this.nyala;
    }

    boolean letakkanPanci(boolean panci) {
        this.panci = panci;
        return this.panci;
    }

    boolean taruhAir(boolean air) {
        this.air = air;
        return this.air;
    }

    boolean masukkanMie(boolean mie) {
        this.mie = mie;
        return this.mie;
    }

    int lama(int waktu) {
        this.waktu = waktu;
        return this.waktu;
    }

}
//class cabang

import java.util.Scanner;

public class RebusAirApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AkuMauMerebusMie rebusan = new AkuMauMerebusMie();
        rebusan.kompor(true);
        rebusan.letakkanPanci(true);
        rebusan.taruhAir(true);
        rebusan.masukkanMie(true);
        rebusan.lama(15);

        if (rebusan.nyala == true) {
            System.out.println("Api dinyalakan");
        } else {
            System.out.println("Api mati");
        }
        if (rebusan.panci == true) {
            if (rebusan.nyala == true) {
                System.out.println("Panci di letakkan");
            } else {
                System.out.println("Nyalakan api terlebih dahulu");
                return;
            }

        } else {
            System.out.println("Matikan api");
            rebusan.nyala = false;
            return;
        }
        if (rebusan.air == true) {
            if (rebusan.nyala == true && rebusan.panci == true) {
                System.out.println("Air diletakkan");
            } else {
                System.out.println("Tidak dapat memasak");
                return;
            }

        }
        if (rebusan.mie == true) {
            if (rebusan.air == true && rebusan.nyala == true && rebusan.panci == true) {
                System.out.println("Mie diletakkan");
                int waktu = rebusan.waktu;
                System.out.print("Masukkan waktu tunggu: ");
                int waktus = input.nextInt();
                String batas = (waktus > waktu) ? "Mie hangus" : "Mie Sempurna";
                System.out.println(batas);
            } else {
                System.out.println("Tidak dapat memasak");
                return;
            }
        }

    }
}

