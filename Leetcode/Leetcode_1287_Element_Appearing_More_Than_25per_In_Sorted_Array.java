public class Leetcode_1287_Element_Appearing_More_Than_25per_In_Sorted_Array {
    public static void main(String[] args){
        int [] arr = {1,2,2,6,6,6,6,7,10};
        int n = arr.length;

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > n / 4){
                result = arr[i];
            }
        }
        System.out.println(result);
    }
}

class Leetcode_1287_Element_Appearing_More_Than_25per_In_Sorted_Array_freq{
    public static void main(String[] args){
        int [] arr = {1,2,2,6,6,6,6,7,10};

        int n = arr.length;
        int result = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int [] freq = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
//        for (int i = 0; i < freq.length; i++) {
//            System.out.print(freq[i]+" ");
//        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] != 0){
                if(freq[i] > n / 4){
                    result = i;
                }
            }
        }
        System.out.println(result);
    }
}
