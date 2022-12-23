public class Main {
    public static void main(String[] args) {
        int[][] a={{2,5,6},{4,8,9},{4,2,1},{5,8,9},{1,3,4}};
        
        int count=0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]==1)
                    count++;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.print("\n");
        }

        System.out.println(count+" tane 1 var.");
    }
}
