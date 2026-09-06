public class Leetcode_Q1_Count_Rotations_With_Exactly_K_Equal_Adjacent_Pairs {
    public static void main(String[] args){
        String s = "aab";

        System.out.println(countRotations(s,1));
    }
    public static int countRotations(String s , int k){
        int n = s.length();
        
        int equal = 0;

        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == s.charAt((i+1) % n)){
                equal++;
            }
        }

        int total = equal;

        if(k == total - 1){
            return equal;
        }
        if(k == total){
            return n - equal;
        }
        return 0;
    }
}
