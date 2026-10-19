public class Acmee {
    public static void main(String[] args){
        int n = 16;
        int start = 10;
        int val = 2;
        int gap = 3;

        for (int i = 1; i <= n ; i++) {
            int temp = start;
            for (int j = 1; j <= i ; j++) {
                if (i == val){
                    System.out.print(temp+" ");
                    temp += 10;

                if(i == j){
                    start += 10;
                    val += gap;
                    gap++;
                }
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
