public class Main {
    public static void main(String[] args) {
        int[][] a={{2,5,6},{4,8,9},{4,2,1},{5,8,9},{1,3,4}};
        int[][] b={{7,1,9},{7,9,8},{5,1,3},{4,5,3},{3,4,1}};
        int[][] toplam=new int[5][3];


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < a[i].length; j++) {
                toplam[i][j]=a[i][j]+b[i][j];
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(b[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(toplam[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
