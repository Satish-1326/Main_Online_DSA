public class Leetcode_3870_Count_Commas_in_Range {
    public static void main(String[] args){
        int n = 1002;

        System.out.println(countCommas(n));
    }
    public static int countCommas(int n){
        long ans = 0;
        long start = 1000;
        long commas = 1;

        while (start <= n){
            long end = start * 1000 - 1;

            if (end > n){
                end = n;
            }

            ans += (end - start + 1) * commas;

            start *= 1000;
            commas++;
        }

        return (int) ans;
    }
}
