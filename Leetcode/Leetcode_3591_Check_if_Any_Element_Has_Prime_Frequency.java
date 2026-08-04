import java.util.HashMap;

public class Leetcode_3591_Check_if_Any_Element_Has_Prime_Frequency {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,4};
        System.out.println(checkPrimeFrequency(arr));
    }
    public static boolean checkPrimeFrequency(int [] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }

        for(int freq : hm.values()){
            if(isPrime(freq)){
                return true;
            }
        }
        return false;
    }
    public static boolean isPrime(int n){
        if( n <= 1){
            return false;
        }
        for (int i = 2; i*i <= n ; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
