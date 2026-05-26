import java.util.HashMap;

public class Leetcode_414_Third_Maximum_Number {
    public static void main(String[] args){
        int [] arr = {1,2};

        int f_max = Integer.MIN_VALUE;
        int s_max = Integer.MIN_VALUE;
        int t_max = Integer.MIN_VALUE;

        HashMap<Integer , Integer>hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
        }

        for(int key : hm.keySet()){
            if (key > f_max){
                f_max = key;
            }
        }
        for(int key : hm.keySet()){
            if (key > s_max && key != f_max){
                s_max = key;
            }
        }
        for(int key : hm.keySet()){
            if (key > t_max && key != s_max && key != f_max){
                t_max = key;
            }
        }
        if(hm.size() < 3){
            System.out.println(f_max);
        }else {
            System.out.println(t_max);
        }
    }
}
