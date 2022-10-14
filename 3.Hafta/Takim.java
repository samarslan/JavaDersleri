package hafta3;

import java.util.Scanner;

public class Takim{

	public static void main(String[] args) {
		Scanner oku=new Scanner(System.in);
		String takim;
    System.out.println("Tuttuğunuz takım adını girin: ");
    takim=oku.next();
    for(int i=0; i<takim.length();i++){
      System.out.println("Yaşasın "+takim);
    }
	}

}
