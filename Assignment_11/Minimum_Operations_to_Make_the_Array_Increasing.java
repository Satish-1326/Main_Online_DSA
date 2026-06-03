public class Minimum_Operations_to_Make_the_Array_Increasing {
    public static void main(String[] args) {
        int [] arr = {1,5,2,4,1};

        int count = 0;

        int prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int ele = arr[i];
            if(ele <= prev){
                count += prev+1-ele;
                prev = prev+1;
            }else {
                prev = ele;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(count);
    }
}
