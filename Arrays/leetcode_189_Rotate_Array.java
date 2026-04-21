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


// APPROACH SECOND USING REVERSE ALGORITHUM .....

class Right_rotate_array_approach2{
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        int n = arr.length;
        leftrotatebyk(arr , 1 , n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void leftrotatebyk(int [] arr , int k , int n){
        k = k % n;

        reverse(arr , 0 , k-1);
        reverse(arr , k , n-1);
        reverse(arr , 0 , n-1);
    }
    public static void reverse(int [] arr , int start , int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

class Right_rotate_array_approach3{
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        int n = arr.length;

        rightRotatebyk(arr , 2 , n);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void rightRotatebyk(int [] arr , int k , int n){
        k = k % n;

        reverse(arr , 0 , n-1);
        reverse(arr , 0 , k-1);
        reverse(arr , k , n - 1);
    }

    public static void reverse(int [] arr , int start , int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

/*

OUTPUT :

**Right rotate array by k-th postion**

In this we observed that if arr = {1,2,3,4,5};
And if we have k = 2 ;
k is a that point where to we need to rotate array
**Then we want output as => ** {4,5,1,2,3}

So lets try

STEP 1 = Rotate the hole array first so it give us the output as => {5,4,3,2,1};
STEP 2 = Rotate the array from 0th position to k - 1 position so it give output as => {4,5,3,2,1}
STEP 3 = Rotate the array from k-th position to n-1(last element of array) so it will gives output as => {4,5,1,2,3}

Hence we solved the very hard level problem...

rotate(arr , 0 , n-1);
rotate(arr , 0 , k - 1);
rotate(arr , k , n - 1);

 */

class Demolecture {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        int[] arr2 = {3, 4, 5, 6, 7, 8};

        int[] result = new int[arr.length + arr2.length];
        int k = 0;


        for (int i = 0; i < arr.length; i++) {
            result[k] = arr[i];
            k++;
        }
        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (arr2[i] == result[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[k] = arr2[i];
                k++;
            }
        }

        System.out.print("Union Elemenets of two array : ");
        for (int i = 0; i < k; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

/*

OUTPUT :

Union Elemenets of two array : 1 2 3 5 6 7 4 8

 */

class maxConsiOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1};
        int max = 0;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                result++;
            } else {
                result = 0;
            }
            max = Math.max(result, max);
        }
        System.out.print(max);
    }
}

class maxConsiOnes_better {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 0, 1, 1, 1};
        int max = 0;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                result++;
            } else {
                result = 0;
            }
            max = Math.max(max, result);
        }

        System.out.println(max);
    }
}
