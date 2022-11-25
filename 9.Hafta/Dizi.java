import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int[] dizi=new int[5];
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(i+1+".Sayıyı girin: ");
            dizi[i]=oku.nextInt();
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
    }
}
