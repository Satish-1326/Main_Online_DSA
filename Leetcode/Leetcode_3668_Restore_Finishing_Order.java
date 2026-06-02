import java.util.HashMap;

public class Leetcode_3668_Restore_Finishing_Order {
    public static void main(String[] args){
        int [] order = {1,4,5,3,2};
        int [] friends = {2,5};

        int [] result = new int [friends.length];
        int k = 0;

        HashMap<Integer , Integer>hm = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            hm.put(friends[i],hm.getOrDefault(friends[i], 0)+1);
        }
        for (int i = 0; i < order.length; i++) {
            if(hm.containsKey(order[i])){
                result[k] = order[i];
                k++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
