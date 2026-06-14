public class Leetcode_88_Merge_Sorted_Array {
    public static void main(String[] args){
        int [] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int [] nums2 = {2,5,6};
        int n = 3;

        Solution88(nums1,m,nums2,n);
    }
    public static void Solution88(int [] nums1, int m , int [] nums2 , int n){
        int [] ans = new int[m+n];
        int blue = 0;
        int green = 0;
        int red = 0;

        while (blue < m && green < n){
            if(nums1[blue] <= nums2[green]){
                ans[red++] = nums1[blue++];
            }else {
                ans[red++] = nums2[green++];
            }
        }
        while (blue < n){
            ans[red++] = nums1[blue++];
        }
        while (green < m){
            ans[red++] = nums2[green++];
        }
        for (int i = 0; i < ans.length; i++) {
            nums1[i] = ans[i];
        }

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]+" ");
        }
    }
}
