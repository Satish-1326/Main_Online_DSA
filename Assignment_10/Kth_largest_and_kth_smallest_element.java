import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

//import java.util.*;
public class Kth_largest_and_kth_smallest_element {
    public static void main(String[] args){
        int [] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;

        Arrays.sort(arr);
        int k_smallest = arr[k - 1];
        int k_largest = arr[arr.length - k];

        System.out.println(k_smallest);
        System.out.println(k_largest);
    }
}

//  THIS CODE WORK PROPER ONLY WHEN THE ALL THE VALUES IN THE ARRAY ARE UNIQUE
// IF VALUE IS DUPLICATED IN THE ARRAY THEN WE NEED TO FIND BETTER APPROACH.


class Kth_largest_and_kth_smallest_element_using_tree{
    public static void main(String[] args){
        int [] arr = {3,2,3,1,2,4,5,5,6};
        int k = 4;

        TreeSet<Integer> set = new TreeSet<>(); // TREE SORT DUPLICATE PN REMOVE KARTO AANI ELEMENT LA SORTED ORDER MADHE PN THEVATO..
        for(int num : arr){
            set.add(num);
        }

        ArrayList<Integer>list = new ArrayList<>(set);
//        System.out.println(set);
//        System.out.println(list);
        int k_smallest = list.get(k - 1);
        int k_greatest = list.get(list.size() - k);

        System.out.println(k_smallest);
        System.out.println(k_greatest);
    }
}

