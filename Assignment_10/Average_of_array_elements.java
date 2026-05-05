import java.util.*;
public class Average_of_array_elements {
    public static void main(String[] args){
        int [] arr = {10,20,30};
        int sum = 0;
        float avg = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        avg = sum/n;

        System.out.println("Average of array elements : "+avg);
    }
}
/*

OUTPUT :

Average of array elements : 20.0

*/

class Average_of_array_elements_hash{
    public static void main(String[] args){
        int [] arr = {10,20,30,60,20};
        float avg = 0;
        int sum = 0;
        int n = arr.length;

        HashMap<Integer , Integer>hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
        }

        for(int key : hm.keySet()){
            int val = hm.get(key);
            while(val != 0){
                sum += key;
//                System.out.println(key);
                val--;
            }
        }
//        System.out.println(hm);
        avg = sum / n;
        System.out.println("Average of array elements : "+avg);
    }
}
/*

OUTPUT :

Average of array elements : 28.0

 */
