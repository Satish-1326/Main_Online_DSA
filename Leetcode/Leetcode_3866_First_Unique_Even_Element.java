import java.util.*;
public class Leetcode_3866_First_Unique_Even_Element {
    public static void main(String[] args){
        int [] arr = {4,4};
//        Arrays.sort(arr);

        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 0 && arr[i] % 2 == 0){
                result = arr[i];
                break;
            }
        }
        System.out.println(result);
    }
}


class Leetcode_3866_First_Unique_Even_Element_using_freq{
    public static void main(String[] args){
        int [] arr = {8,2};

        int result = -1 ;
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

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0 && freq[arr[i]] == 1){
                result = arr[i];
                break;
            }
        }
        System.out.println(result);
    }
}

class Leetcode_3866_First_Unique_Even_Element_using_hashmap{
    public static void main(String[] args){
        int [] arr = {4,4};
        int result = - 1;

        HashMap<Integer , Integer>hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i] , 0)+1);
        }

        for(int key : hm.keySet()){
            if(hm.get(key) == 1 && key % 2 == 0){
                result = key;
                break;
            }
        }
        System.out.println(result);
    }
}

// Problem HashMap kadhi ch sequince madhe value det nahi tya mule problem hoto sequince
// value access karayala

