public class Leetcode_507_Perfect_Number {
    public static void main(String[] args){
        System.out.println(checkPerfectNumber(18));
    }
    public static boolean checkPerfectNumber(int num){
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if(num % i == 0){
                sum += i;
            }
        }
        if(sum == num) return true;
        return false;
    }
}
