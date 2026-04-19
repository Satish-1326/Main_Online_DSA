public class leetcode_26_remove_duplicate {
    public static void main(String[] args){
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        int a = 0;
//        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[a] != arr[i]){
                a++;
                arr[a] = arr[i];
//                count++;
            }
        }

        System.out.print("Array after removing duplicate : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

/*

OUTPUT :

Array after removing duplicate : 0 1 2 3 4 2 2 3 3 4

 */
