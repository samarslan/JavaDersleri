import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int benzin, yol = 0;
        System.out.println("Alınan benzini giriniz:\n");
        benzin = input.nextInt();
        do {
            System.out.println("Yüklenen benzin ile kaç km gittiniz: ");
            yol = input.nextInt();
            if (yol > 1000) {
                System.out.println("Km maximum 999 olmalıdır.");
            }
        }
        while (yol > 1000);
        {
            System.out.println("Harcanan benzın mıktarı " + benzin / yol);

        }
    }
}
