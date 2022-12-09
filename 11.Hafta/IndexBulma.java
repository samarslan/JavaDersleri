public class Main {
    public static void main(String[] args) {
        int[] dizi=new int[]{1,6,45,7,34,8,3,7,12};

        System.out.printf("İlk 7'nin indexi: " + IndexBul(dizi, 55555));
    }

    public static int IndexBul(int[] dizi, int deger){
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]==deger) {
                return i;
            }
        }
        System.out.println(deger+" yok");
        return 999999;
    }
}
