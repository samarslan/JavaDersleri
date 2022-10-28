import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Sayı girin");
        System.out.println(burc(oku.nextInt()));
    }

    public static String burc(int a){
        if(a==1){
            return "At";
        } else if (a==2) {
            return "Ejderha";
        } else if (a==3) {
            return "Orka";
        }
        else{
            return "Hatalı giriş";
        }
    }
}
