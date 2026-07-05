public class Leetcode_204_Count_Primes {
    public static void main(String[] args){
        int n = 10;
        System.out.println(countPrimes(n));
    }

    // checking prime numbers
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    // counting prime numbers
    public static int countPrimes(int n){
        int count = 0;

        for (int i = 2; i < n ; i++) {
            if (isPrime(i)){
                count++;
            }
        }
        return count;
    }
}

// but this solution gives the TIME COMPLEXITY => O(n√n)

// Let's solve using optimal solution
// Sieve of Eratosthenes. (Algorithm)

class Leetcode_204_Count_Primes_optimal{
    public static void main(String[] args){
        int n = 14;
        System.out.println(solutionPrime(n));
    }

    public static int solutionPrime(int n){
        int count = 0;
        int [] ans = new int[n+1];

        for (int i = 2; i < n; i++) {
            ans[i] = 1;
        }

        for (int i = 2; i < n; i++) {
            if(ans[i] == 1){
                for (int j = 2*i; j <= n ; j += i) {
                    ans[j] = 0;
                }
            }
        }

        for (int i = 0; i < ans.length; i++) {
            if(ans[i] == 1){
                count++;
            }
        }
        return count;
    }
}