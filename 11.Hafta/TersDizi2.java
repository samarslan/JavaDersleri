public class Main {
    public static void main(String[] args) {
        int[] dizi=new int[]{1,6,45,7,34,8,3,7,12};
        for (int i = 0; i < dizi.length; i++) {
            System.out.printf(dizi[i]+"\t");
        }
        TersDizi(dizi);
        System.out.println();
        for (int i = 0; i < dizi.length; i++) {
            System.out.printf(dizi[i]+"\t");
        }

    }

    public static void TersDizi(int[] dizi){
        int temp=0;
        for (int i = 0; i < dizi.length/2; i++) {
            temp=dizi[i];
            dizi[i]=dizi[dizi.length-i-1];
            dizi[dizi.length-i-1]=temp;
        }
    }
}
