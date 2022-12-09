import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] partiler=new String[]{"Salam","Sucuk","Pastırma","Açma","Zeytin"};
        int[] oylar=OyDoldur();
        double[] yuzde=new double[5];
        OranHesapla(oylar,yuzde);

        int kazanan=MaksimumDizi(oylar);
        System.out.println("Kazanan: "+partiler[kazanan]+" Partisi "+oylar[kazanan]+ " oy ile seçmenlerin %"+yuzde[kazanan]+"'nın oyunu aldı");

        System.out.println("Sonuçlar:");
        for (int i = 0; i < partiler.length; i++) {
            System.out.println(partiler[i]+" Partisi "+oylar[i]+ " oy ile seçmenlerin %"+yuzde[i]+"'nın oyunu aldı");
        }
    }

    private static int Toplam(int[] oylar) {
        int toplamOy=0;
        for (int i = 0; i < oylar.length; i++) {
            toplamOy+=oylar[i];
        }
        return toplamOy;
    }

    private static int[] OyDoldur() {
        Random rand=new Random();

        int[] oylar=new int[5];

        for (int i = 0; i < oylar.length; i++) {
            oylar[i]=1000+rand.nextInt(9000);
        }
        return oylar;
    }

    private static void OranHesapla(int[] oylar, double[] oranlar) {
        for (int i = 0; i < oranlar.length; i++) {
            oranlar[i]=100*oylar[i]/Toplam(oylar);
        }
    }

    public static int MaksimumDizi(int[] dizi){
        int maksInd=0,maksVal=dizi[0];

        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]>maksVal){
                maksInd=i;
                maksVal=dizi[i];
            }
        }
        return maksInd;
    }
}
