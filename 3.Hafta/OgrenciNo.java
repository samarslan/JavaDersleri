package hafta3;

import java.util.Scanner;

public class OgrenciNo {

	public static void main(String[] args) {
		Scanner oku=new Scanner(System.in);
		String ogrno, yil;
		int uz;
		do {
			System.out.println("13 haneli öğrenci no: ");
			ogrno=oku.next();
			uz=ogrno.length();
		}while(uz!=13);
		yil = ogrno.substring(0,4);
		System.out.println("Okula girdiği yıl: "+yil);
	}

}
