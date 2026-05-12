public class FoorEachLoop {
    public static void main(String[] args){
        int [][] arr = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
        };

        for (int i = 0; i < arr.length; i++) {
            for(int ele : arr[i]){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}

class FoorEachLoop_two{
    public static void main(String[] args){
        int [][] arr = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
        };

        for (int [] a : arr) {
            for (int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}

