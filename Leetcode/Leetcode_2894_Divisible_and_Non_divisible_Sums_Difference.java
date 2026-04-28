import java.util.*;
public class Leetcode_2894_Divisible_and_Non_divisible_Sums_Difference {
    public static void main(String[] args){
        int n = 10;
        int m = 3;

        int div_sum = 0;
        int not_div_sum = 0;

        for (int i = 1; i <= n; i++) {
            if(i % m == 0){
                div_sum = div_sum + i;
            }
        }

        for (int i = 1; i <= n ; i++) {
            if(i % m != 0){
                not_div_sum = not_div_sum + i;
            }
        }

        System.out.print("Diffrence of divisible and not divisible sum : ");
        System.out.print(not_div_sum - div_sum);
    }
}
/*

OUTPUT :

Diffrence of divisible and not divisible sum : 19

 */

class Divisible_sum_diff_using_freq_array{
    public static void main(String[] args){
        int n = 10;
        int m = 3;

        int sum1 = 0;
        int sum2 = 0;

        int [] freq = new int[n+1];

        for (int i = 1; i <= n; i++) {
            freq[i]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if(i % m == 0){
                sum1+=i;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if(i % m != 0){
                sum2+=i;
            }
        }
        System.out.println(sum2 - sum1);
    }
}


class Divisible_sum_diff_using_hash_map{
    public static void main(String[] args) {
        int n = 10;
        int m = 3;

        int num1 = 0;
        int num2 = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        for(int key : hm.keySet()){
            if(key % m == 0){
                num1+=key;
            }
            if (key % m != 0){
                num2+=key;
            }
        }

        System.out.println(num2-num1);
        System.out.println(hm);
    }
}