public class Leetcode_11_Container_With_Most_Water {
    public static void main(String[] args){
        int [] height = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(height));
    }
    public static int maxArea(int [] height){

        //TIME COMPLEXITY IS O(n^2)
//        int max = 0;
//        for (int i = 0; i < height.length; i++) {
//            for (int j = i+1; j < height.length; j++) {
//                int width = j - i;
//
//                int h = Math.min(height[j] , height[i]);
//
//                int area = width*h;
//
//                max = Math.max(max , area);
//            }
//        }
//        return max;

        int max = 0;

        int left = 0;
        int right = height.length-1;

        while (left < right){
            int width = right-left;

            int h = Math.min(height[left] , height[right]);

            int area = width*h;

            max = Math.max(area , max);

            if (height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
