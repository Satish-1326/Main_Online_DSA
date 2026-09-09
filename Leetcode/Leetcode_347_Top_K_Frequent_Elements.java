import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Leetcode_347_Top_K_Frequent_Elements {
    public static void main(String[] args){
//        int [] arr = {1,2,1,2,1,2,3,1,3,2};
//        int k = 2;
//
//        HashMap<Integer , Integer> hm = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
//        }
//
//        ArrayList<Integer> al = new ArrayList<>();
//       for(int key : hm.keySet()){
//           al.add(key);
//       }
//       Integer [] sort_al = new Integer[al.size()];
//        for (int i = 0; i < al.size(); i++) {
//            sort_al[i] = al.get(i);
//        }
//        Arrays.sort(sort_al,(a,b) -> hm.get(b) - hm.get(a));
//
//        int [] result = new int[k];
//        for (int i = 0; i < k; i++) {
//            result[i] = sort_al[i];
//        }
//
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i]+" ");
//        }
        int [] nums = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(nums,2)));
    }
    public static int [] topKFrequent(int [] nums , int k){
        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int num : nums){
            hm.put(num , hm.getOrDefault(num , 0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a,b) -> Integer.compare(hm.get(a) , hm.get(b))
        );
        for(int num : hm.keySet()){
            pq.offer(num);

            if(pq.size() > k){
                pq.poll();
            }
        }

        int [] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        return ans;
    }
}

// Done And Dusted ....