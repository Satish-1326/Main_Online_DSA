public class Leetcode_69_Sqrt_x {
    public static void main(String[] args){
        int n = 4;
        System.out.println(mySqrt(n));
    }
    public static int mySqrt(int n){
        int low = 1;
        int high = n;
        int ans = 0;

        while(low <= high){
            int mid = low+(high-low)/2;
            long sqr = (long) mid*mid;

            if(sqr <= n){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}
