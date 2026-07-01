public class Leetcode_367_Valid_Perfect_Square {
    public static void main(String[] args){
        int n = 16;
        System.out.println(isPerfectSquare(n));
    }
    public static boolean isPerfectSquare(int n){
        int low = 1;
        int high = n;

        while (low <= high){
            int mid = low+(high-low)/2;
            long sq = (long) mid*mid;
            if (sq == n){
                return true;
            }else if(sq < n){
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }
        return false;
    }
}
