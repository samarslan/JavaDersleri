package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int yol, tl;
        Scanner oku=new Scanner(System.in);

        System.out.println("Kaç tl benzin dolduruldu?");
        tl=oku.nextInt();


        System.out.println("Kaç km yol gidildi?");
        yol=oku.nextInt();
        if(yol>1000){
            System.out.println("En fazla 1000km girebilirsiniz");
            while(true){
                System.out.println("Kaç km yol gidildi?");
                yol=oku.nextInt();
                if(yol>1000){
                    System.out.println("En fazla 1000km girebilirsiniz");
                }
                else {
                    break;
                }
            }
        }
        System.out.println("Kilometre başına "+(float)tl/(float) yol+" tl para harcadınız");
    }
}
