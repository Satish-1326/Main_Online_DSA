public class Sorting_for_0s_1s_2s {
    public static void main(String[] args){
        int [] arr = {1,1,0,1,2,0,1,2};

        int [] result = new int[arr.length];
        int in = 0;

        int ones_count = 0;
        int two_count = 0;
        int zero_count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) zero_count++;
            if(arr[i] == 1) ones_count++;
            if(arr[i] == 2) two_count++;
        }
        
        while (zero_count > 0){
            result[in] = 0;
            in++;
            zero_count--;
        }
        while (ones_count > 0){
            result[in] = 1;
            in++;
            ones_count--;
        }
        while (two_count > 0){
            result[in] = 2;
            in++;
            two_count--;
        }

        System.out.print("Sorted Array using loop : ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}

/*

OUTPUT :

Sorted Array using loop : 0 0 1 1 1 1 2 2

 */
