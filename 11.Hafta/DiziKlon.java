public class Main {
    public static void main(String[] args) {
        int[] dizi=new int[]{1,6,45,7,34,8,3,7,12};
        int[] dizi2=KopyaDizi(dizi);

        dizi[0]=1500;
        dizi2[0]=4848;

        for (int i = 0; i < dizi.length; i++) {
            System.out.printf(dizi[i]+"\t");
        }
        System.out.println();
        for (int i = 0; i < dizi2.length; i++) {
            System.out.printf(dizi2[i]+"\t");
        }
    }

    public static int[] KopyaDizi(int[] dizi){
        int[] b=new int[dizi.length];

        for (int i = 0; i < dizi.length; i++) {
            b[i]=dizi[i];
        }

        return b;
    }
}
