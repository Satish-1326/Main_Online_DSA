public class Leetcode_3783_Mirror_Distance_of_an_Integer {
    public static void main(String[] args){
        int n = 7;
        int orginal = n;
        int reverse = 0;

        while (n != 0){
            int digit = n % 10;
            reverse = reverse*10+digit;
            n = n / 10;
        }
        System.out.println(Math.abs(orginal - reverse));
    }
}
