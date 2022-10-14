package hafta3;

import java.util.Scanner;

public class Tersten{

	public static void main(String[] args) {
		Scanner oku=new Scanner(System.in);
		String ad="",tersad="";
    int uz;
    System.out.println("adınızı girin: ");
    ad=oku.nextLine();
    ad=ad.toUpperCase();
    uz=ad.length();

    while(uz>0){
      tersad=tersad+ad.substring(uz-1,uz);
      uz--;
    }
    System.out.println(tersad);
	}

}
