public class Leetcode_121_Best_Time_to_Buy_and_Sell_Stock {
     public static void main(String[] args){
         int [] arr = {7,1,5,3,6,4};
         int max_profite = 0;

         for (int i = 0; i < arr.length; i++) {
             for (int j = i+1; j < arr.length; j++) {
                 int profite = arr[j] - arr[i];
                 max_profite = Math.max(max_profite , profite);
             }
         }
         System.out.println(max_profite);
     }
}
/*

OUTPUT :
5

 */

class Leetcode_121_Best_Time_to_Buy_and_Sell_Stock_approach_two{
    public static void main(String[] args){
        int [] arr = {7,1,5,3,6,4};
        int max = 0;
        int low_price = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            low_price = Math.min(low_price , arr[i]);
            int profite = arr[i] - low_price;
            max = Math.max(max , profite);
        }
        System.out.println(max);
    }
}
/*

OUTPUT :
5

 */