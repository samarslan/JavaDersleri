import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int[] dizi=new int[5];
        float ortalama=0;
        int toplam=0;
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(i+1+".Sayıyı girin: ");
            dizi[i]=oku.nextInt();
            toplam+=dizi[i];
        }
        ortalama=toplam/5f;
        System.out.println(ortalama);
    }
}
