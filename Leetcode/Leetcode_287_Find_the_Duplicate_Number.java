import java.util.HashMap;

public class Leetcode_287_Find_the_Duplicate_Number {
    public static void main(String[] args){
        int dupli = - 1;
        int [] arr = {3,1,3,4,2};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > 0){
                dupli = arr[i];
            }
        }
        System.out.println(dupli);
    }
}

class Leetcode_287_Find_the_Duplicate_Number_using_hash{
    public static void main(String[] args){
        int [] arr = {3,1,3,4,2 };
        int dupli = -1;

        HashMap<Integer , Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
        }
        for(int key : hm.keySet()){
            if(hm.get(key) > 1){
                dupli = key;
            }
        }
        System.out.println(dupli);
    }
}
