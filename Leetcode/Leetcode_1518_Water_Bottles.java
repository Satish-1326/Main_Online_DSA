public class Leetcode_1518_Water_Bottles {
    public static void main(String[] args){
        int numBottles = 9;
        int numExchange = 3;
        int result = Solution1518(numBottles,numExchange);
        System.out.println(result);
    }
    public static int Solution1518(int numBottles , int numExchange){
        int sum = numBottles;
        int empty = numBottles;

        while (empty >= numExchange){
            int newBottle = empty / numExchange;
            int rem = empty % numExchange;

            sum += newBottle;
            empty = newBottle+rem;
        }
        return sum;
    }
}
