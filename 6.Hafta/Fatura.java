import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int elektrik, su;
        Scanner oku=new Scanner(System.in);

        System.out.println("Elektrik faturası girin: ");
        elektrik= oku.nextInt();

        System.out.println("Su faturası girin: ");
        su= oku.nextInt();

        System.out.println("Toplam fatura tutarı: "+Fatura(elektrik, su));
    }

    public static float Fatura(int elektrik, int su) {
        int toplam = elektrik + su;
        if (toplam > 500) {
            return toplam - ((toplam / 100) * 20);
        } else {
            return toplam;
        }
    }
}
