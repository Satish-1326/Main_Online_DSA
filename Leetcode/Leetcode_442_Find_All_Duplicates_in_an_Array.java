import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Leetcode_442_Find_All_Duplicates_in_an_Array {
    public static void main(String[] args){
        int [] arr = {1,1,2};
        Arrays.sort(arr);

        HashMap<Integer , Integer> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
        }
        for(int key : hm.keySet()){
            if(hm.get(key) > 1){
                al.add(key);
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i] == arr[j]){
//                    count++;
//                }
//            }
//            if(count > 0){
//                al.add(arr[i]);
//            }
//        }
        System.out.println(al);
    }
}
