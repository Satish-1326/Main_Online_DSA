// Q13. Replace Elements with Frequency


//1st Approach => Using Broot force
import java.util.*;
public class Replace_Elements_with_Frequency {
    public static void main(String[] args){
        int [] arr = {1,2,2,3};
        int n = arr.length;
        int k = 0;

        int [] result = new int[n];

        for (int i = 0; i < arr.length; i++) {
            int count = 0 ;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            result[k++] = count;
        }

        System.out.print("After Replacing Elements with Frequency : ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] +" ");
        }
    }
}
/*

OUTPUT :

After Replacing Elements with Frequency : 1 2 2 1

 */


// 2nd Approach => Using frequency Array

class Replace_Elements_With_frequency_using_freq_array{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] freq = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(freq[arr[i]]+" ");
        }
    }
}

/*

OUTPUT :

1 2 2 1

 */


// 3rd Approach => Using HashMap

class Replace_Elements_with_Frequency_using_hash{
    public static void main(String[] args){
        int [] arr = {1,2,2,3};

        int [] result = new int[arr.length];
        int index = 0;

        HashMap<Integer , Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
        }

        System.out.println(hm);

        System.out.print("After Replacing Elements with Frequency : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(hm.get(arr[i]) +" ");
        }

    }
}

/*

OUTPUT :

After Replacing Elements with Frequency : 1 2 2 1
 */
