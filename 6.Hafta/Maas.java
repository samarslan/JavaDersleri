import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maas, cocuk = 0, parca = 0,toplam,c_ek = 0,p_ek = 0;
        Scanner oku = new Scanner(System.in);

        System.out.println("Maaşı girin: ");
        maas = oku.nextInt();

        System.out.println("Çocuk sayısını girin: ");
        cocuk = oku.nextInt();

        System.out.println("Parça sayısı girin: ");
        parca = oku.nextInt();

        c_ek=Cocuk(maas, cocuk);
        p_ek=Parca(maas,parca);
        toplam=maas+c_ek+p_ek;

        System.out.printf("İşçinin maaşı:\t"+maas+"\nÇocuk sayısından ek ödeme:\t"+c_ek+"\nParça sayısından ek ödeme:\t"+p_ek+"\nToplam:\t"+toplam);
    }

    public static int Cocuk(int maas, int cs) {
        if (cs == 0) return 0;
        else if (cs == 1) return ((maas / 100) * 5);
        else if (cs == 2) return ((maas / 100) * 10);
        else return ((maas / 100) * 15);
    }
    public static int Parca(int maas, int ps) {
        if (ps>0&&ps<50) return ((maas / 100) * 5);
        else if (ps>49&&ps<100) return ((maas / 100) * 10);
        else if (ps>99) return ((maas / 100) * 15);
        else return 0;
    }
}
