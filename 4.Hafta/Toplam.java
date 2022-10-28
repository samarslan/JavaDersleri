import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i=0, toplam=0;
        int[] dizi= new int[10];
        Scanner oku=new Scanner(System.in);
        for (i=0; i<10;i++){
            System.out.println("Sayı girin: ");
            dizi[i]=oku.nextInt();
            if(dizi[i]!=2&&dizi[i]%2==0){
                toplam=toplam+dizi[i];
            }
        }
        System.out.println(toplam);
    }
}
