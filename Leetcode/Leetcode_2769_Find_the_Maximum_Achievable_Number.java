public class Leetcode_2769_Find_the_Maximum_Achievable_Number {
    public static void main(String[] args){
        int num = 4;
        int t = 1;
        System.out.println(theMaximumAchievableX(num,t));
    }
    public static int theMaximumAchievableX(int num , int t){
        return num + 2 * t;
    }
}
