import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Sayı girin");
        dongu(oku.nextInt());
    }

    public static void dongu(int a){
        for(int i=0;i<a;i++){
            System.out.println(i);
        }
    }
}
