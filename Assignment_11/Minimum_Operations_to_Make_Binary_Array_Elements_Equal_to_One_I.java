public class Minimum_Operations_to_Make_Binary_Array_Elements_Equal_to_One_I {
    public static void main(String[] args){
        int [] arr = {0,1,1,1,0,0};
        int n = arr.length;
        int count = 0;

        for (int i = 0; i <= n - 3; i++) {
            if (arr[i] == 0) {
                arr[i] ^= 1;
                arr[i + 1] ^= 1;
                arr[i + 2] ^= 1;
                count++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                System.out.println(-1);
            }
        }
        System.out.println(count);
    }
}
