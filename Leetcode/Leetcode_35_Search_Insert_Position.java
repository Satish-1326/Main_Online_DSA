public class Leetcode_35_Search_Insert_Position {
    public static void main(String[] args){
        int [] arr = {1,3,5,6};
        int target = 5;

        int first = 0;
        int second = 1;
        int result = - 1;
        int n = arr.length;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                result = i;
                break;
            }
        }

        if(target > arr[n - 1]){
            result = n;
        }

        for (int i = 0; i < arr.length; i++) {
            if(target > arr[first] && target < arr[second]){
                result = first + 1;
            }
        }
        System.out.println(result);
    }
}
