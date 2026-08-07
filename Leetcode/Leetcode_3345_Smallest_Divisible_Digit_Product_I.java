public class Leetcode_3345_Smallest_Divisible_Digit_Product_I {
    public static void main(String[] args){
        System.out.println(smallestNumber(10,2));
    }
    public static int smallestNumber(int n , int t){
        while (true){
            if(isValid(n,t)){
                return n;
            }
            n++;
        }
    }
    private static boolean isValid(int num , int t){
        int product = 1;
        int temp = num;
        if(temp == 0){
            product = 0;
        }else{
            while (temp > 0){
                product *= (temp%10);
                temp /= 10;
            }
        }
        return product % t == 0;
    }
}
