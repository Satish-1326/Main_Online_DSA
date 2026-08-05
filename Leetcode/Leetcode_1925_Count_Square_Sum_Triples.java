public class Leetcode_1925_Count_Square_Sum_Triples {
    public static void main(String[] args){
        int n = 5;
        System.out.println(countTriples(n));
    }
    public static int countTriples(int n){
        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int a = (i*i) + (j*j);
                int b = (int) Math.sqrt(a);

                if(b <= n && b*b == a){
                    count++;
                }
            }
        }
        return count;
    }
}
