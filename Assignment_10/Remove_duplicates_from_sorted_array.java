import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Remove_duplicates_from_sorted_array {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        int[] arr = {1, 1, 2, 2, 3, 4};

        for (int i = 0; i < arr.length; i++) {
            if (!al.contains(arr[i])) {
                al.add(arr[i]);
            }
        }
        int n = al.size();
        int[] new_arr = new int[n];
        int k = 0;
        for (int i = 0; i < al.size(); i++) {
            new_arr[k] = al.get(i);
            k++;
        }
        int result = new_arr.length;
        ;
        System.out.println(result);
    }
}

/*

OUTPUT :
[1, 2, 3, 4]

 */

class Remove_duplicates_from_sorted_array_using_hashset{
    public static void main(String[] args){
        int [] arr = {1, 1, 2, 2, 3, 4};

        Set<Integer>set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }
        System.out.println(set.size());
    }
}
