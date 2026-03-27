public class GCD_of_Odd_and_Even_Sums {
    public static void main(String [] args){
        int n = 4;

        Solution3658 solution3658 = new Solution3658();
        System.out.println("GCD of even and odd numbers :"+solution3658.gcdOfOddEvenSums(n));

    }
}
class Solution3658{
    public int gcdOfOddEvenSums(int n){
        int even_sum = 0;
        int odd_sum = 0;

        for(int i = 1 ; i <= n*2 ; i++){
            if(i % 2 == 0){
                even_sum += i;
            }
            if(i % 2 != 0){
                odd_sum += i;
            }
        }


        int max = 1;

        while(even_sum != 0 && odd_sum != 0){
            if(even_sum > odd_sum){
                even_sum = even_sum % odd_sum;
            }
            else{
                odd_sum = odd_sum % even_sum;
            }
        }

        if(even_sum == 0){
            max = odd_sum;
        }
        else {
            max = even_sum;
        }
        return max;
    }
}

/*
* OUTPUT :
* GCD of even and odd numbers :4
*
* */
