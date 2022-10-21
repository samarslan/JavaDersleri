package org.example;

public class Main {

    public static void main(String[] args) {
        int rs, yazi=0, tura=0;

        for(int i=0;i<10;i++){
            rs=(int)(Math.random()*2);
            switch (rs){
                case 0: yazi++; break;
                case 1: tura++; break;
            }
        }
        System.out.println(yazi+ " kere yazi. "+tura+" kere tura geldi.");
    }
}
