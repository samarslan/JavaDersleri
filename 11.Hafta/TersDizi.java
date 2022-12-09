public class Main {
    public static void main(String[] args) {
        int[] dizi=new int[]{1,6,45,7,34,8,3,7,12};
        int[] dizi2=TersDizi(dizi);

        for (int i = 0; i < dizi.length; i++) {
            System.out.printf(dizi[i]+"\t");
        }
        System.out.println();
        for (int i = 0; i < dizi2.length; i++) {
            System.out.printf(dizi2[i]+"\t");
        }
    }

    public static int[] TersDizi(int[] dizi){
        int[] b=new int[dizi.length];

        for (int i = 0; i < dizi.length; i++) {
            b[dizi.length-i-1]=dizi[i];
        }

        return b;
    }
}
