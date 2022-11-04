import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner oku=new Scanner(System.in);

        System.out.printf("Sayı girin:");
        sayi=oku.nextInt();

        if(Kontrol(sayi)==true) System.out.println("Süper sayı.");
        else System.out.println("Süper sayı değil.");
    }
    public static boolean Kontrol(int a){
        int toplam=0;

        for (int i=1;i<(a/2)+1;i++){
            if(a%i==0){
                toplam+=i;
            }
        }
        if(toplam==a) return true;
        else return false;
    }
}
