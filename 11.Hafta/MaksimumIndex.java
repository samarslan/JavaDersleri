public class Main {
    public static void main(String[] args) {
        int[] dizi=new int[]{1,6,45,7,34,8,3,7,12};
        System.out.printf("Maksimum: "+dizi[MaksimumDizi(dizi)]);
   }

    public static int MaksimumDizi(int[] dizi){
        int maksInd=0,maksVal=dizi[0];

        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]>maksVal){
                maksInd=i;
                maksVal=dizi[i];
            }
        }
        return maksInd;
    }
}
