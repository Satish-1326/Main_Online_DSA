public class leetcode_189_Rotate_Array {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 3;

        int [] temp = new int[n];
        k = k % n;

        for (int i = 0; i < k; i++) {
            temp[n-k+i] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            temp[i] = arr[k+i];
        }

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+" ");
        }
    }
}
