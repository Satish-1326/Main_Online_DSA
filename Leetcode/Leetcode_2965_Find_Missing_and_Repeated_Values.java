import java.util.HashMap;
import java.util.HashSet;

public class Leetcode_2965_Find_Missing_and_Repeated_Values {
    public static void main(String[] args){
        int [][] arr = {
                {1,3},
                {2,2}
        };

        int [] result = Solution2965(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static int [] Solution2965(int [][] arr){
        int n = arr.length;
        int N = n*n;
        int [] freq = new int[N+1];
        for(int [] row : arr){
            for(int num : row){
                freq[num]++;
            }
        }
        int repeated = -1;
        int missing = -1;
        for(int i = 1 ; i <= N ; i++){
            if(freq[i] == 2){
                repeated = i;
            }
            else if(freq[i] == 0){
                missing = i;
            }
        }
        return new int[]{repeated,missing};
    }
}
