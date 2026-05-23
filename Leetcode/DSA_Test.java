public class DSA_Test {
    public static void main(String[] args) {
        int n = 4;
        int num = 1;


        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(num + " ");
                    num++;
                }
                System.out.println();
            }


            if (i % 2 != 0) {
                for (int j = n; j > 0; j--) {
                    num--;
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            num = num + 4;
        }
    }
}
