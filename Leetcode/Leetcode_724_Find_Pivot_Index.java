public class Leetcode_724_Find_Pivot_Index {
    public static void main(String[] args){
        int [] arr = {1,7,3,6,5,6};

        int ans = 0;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            int left_sum = 0;
            int right_sum = 0;

            for (int j = 0; j < i; j++) {
                left_sum+= arr[j];
            }
            for (int j = i+1; j < arr.length; j++) {
                right_sum += arr[j];
            }

            if (left_sum == right_sum){
                ans = i;
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println(-1);
        }else{
            System.out.println(ans);
        }
    }
}
