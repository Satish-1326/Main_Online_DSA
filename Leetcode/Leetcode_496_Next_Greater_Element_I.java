import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Leetcode_496_Next_Greater_Element_I {
    public static void main(String[] args){
        int [] nums1 = {4,1,2};
        int [] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
    public static int [] nextGreaterElement(int [] nums1 , int [] nums2){
        int n = nums1.length;

        int [] result = new int[n];

        for (int i = 0; i < nums1.length; i++) {

            result[i] = -1;

            int index = 0;
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]){
                    index = j;
                    break;
                }
            }
            for (int j = index+1; j < nums2.length; j++) {
                if(nums2[j] > nums1[i]){
                    result[i] = nums2[j];
                    break;
                }
            }
        }
        return result;
    }
}

class Leetcode_496_Next_Greater_Element_I_approach2{
    public static void main(String[] args){
        int [] nums1= {4,1,2};
        int [] nums2 = {1,3,4,2};

        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
    public static int [] nextGreaterElement(int [] nums1 , int [] nums2){
        Stack<Integer> st = new Stack<>();
        HashMap<Integer , Integer> hm = new HashMap<>();

        for (int i = nums2.length; i >= 0 ; i--) {
            while (!st.isEmpty() && st.peek() <= nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                hm.put(nums2[i],-1);
            }else{
                hm.put(nums2[i] , st.peek());
            }
            st.push(nums2[i]);
        }

        int [] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = hm.get(nums1[i]);
        }
        return result;
    }
}
