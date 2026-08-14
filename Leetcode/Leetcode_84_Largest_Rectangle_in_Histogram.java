import java.util.Stack;

public class Leetcode_84_Largest_Rectangle_in_Histogram {
    public static void main(String[] args){
        int [] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
    public static int largestRectangleArea(int [] heights){
        Stack <Integer> st = new Stack<>();
        int ans = 0;
        for (int i = 0; i < heights.length; i++) {
            int current = heights[i];
            while (!st.isEmpty() && heights[st.peek()] > current){

                int height = heights[st.pop()];

                int width;

                if(st.isEmpty()){
                    width = i;
                }else{
                    width = i - st.peek() - 1;
                }
                int area = height*width;

                ans = Math.max(area,ans);
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            int height = heights[st.pop()];

            int width;
            if(st.isEmpty()){
                width = heights.length;
            }else{
                width = heights.length - st.peek() - 1;
            }
            int area = height*width;
            ans = Math.max(ans,area);
        }
        return ans;
    }
}
