public class Main {
    public static void main(String[] args) {
        int[] dizi=new int[]{1,6,45,7,34,8,3,7,12};
        int[] ters=TersDizi(dizi);
        int[] kopya=KopyaDizi(dizi);
        int max=MaksimumDizi(dizi), min=MinimumDizi(dizi);

        System.out.println("Düzü. Maksimumu: "+max+". Minimumu: "+min);
        for (int i = 0; i < dizi.length; i++) {
            System.out.printf(dizi[i]+"\t");
        }
        System.out.println("\nTersi:");
        for (int i = 0; i < ters.length; i++) {
            System.out.printf(ters[i]+"\t");
        }
        System.out.println("\nKopyası:");
        for (int i = 0; i < kopya.length; i++) {
            System.out.printf(kopya[i]+"\t");
        }
    }

    public static int[] TersDizi(int[] dizi){
        int[] b=new int[dizi.length];

        for (int i = 0; i < dizi.length; i++) {
            b[dizi.length-i-1]=dizi[i];
        }

        return b;
    }
    public static int[] KopyaDizi(int[] dizi){
        int[] b=new int[dizi.length];

        for (int i = 0; i < dizi.length; i++) {
            b[i]=dizi[i];
        }

        return b;
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
    public static int MinimumDizi(int[] dizi){
        int minInd=0,minVal=dizi[0];

        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]<minVal){
                minInd=i;
                minVal=dizi[i];
            }
        }
        return minInd;
    }
}
