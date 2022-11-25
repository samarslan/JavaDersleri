public class Main {
    public static void main(String[] args) {
        int[] dizi={1,2,3,4,5};
        int[] diziKopya=new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            diziKopya[i]=dizi[i];
        }
        for (int i = 0; i < diziKopya.length; i++) {
            System.out.println(diziKopya[i]);
        }
    }
}
