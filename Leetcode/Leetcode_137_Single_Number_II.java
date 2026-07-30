import java.util.HashMap;

public class Leetcode_137_Single_Number_II {
    public static void main(String[] args){
        int [] arr = {2,2,3,2};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int [] arr){
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < arr.length; i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        int result = 0;
        for(int key : hm.keySet()){
            if(hm.get(key) != 3){
                result = key;
                break;
            }
        }
        return result;
    }
}
