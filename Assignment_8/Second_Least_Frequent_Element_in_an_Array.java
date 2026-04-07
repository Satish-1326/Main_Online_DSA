// Return second least frequent element in an array

// Approach 1st => Using Broot force
import java.util.*;
public class Second_Least_Frequent_Element_in_an_Array {
    public static void main(String[] args){
        int [] arr = {1,1,2,2,2,3};
        int f_least = 0;
        int s_least = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0 ;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count < f_least){
                f_least = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int count = 0 ;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count < s_least && arr[i] != f_least){
                s_least = arr[i];
            }
        }
        System.out.println("second least frequent element in an array : "+s_least);
    }
}

/*

OUTPUT :

second least frequent element in an array : 1

 */


// 2nd Approach => Frequency Array


class Second_Least_Frequent_Element_in_an_Array_using_freq_arr{
    public static void main(String[]args){
        int [] arr = {1,1,2,2,2,3};
        int f_least = Integer.MAX_VALUE;
        int s_least = Integer.MAX_VALUE;

        int f_element = -1;
        int s_element = -1;

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int [] freq = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if(freq[i] < f_least && freq[i] > 0){
                f_least = freq[i];
                f_element = i;

//                s_least = i;
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if(freq[i] < s_least && i != f_element && freq[i] > 0){
                s_least = freq[i];
                s_element = i;
            }
        }
//        System.out.println(f_element);
        System.out.println("second least frequent element in an array : "+s_element);
    }
}

/*

OUTPUT :

second least frequent element in an array : 1

 */



// 3rd Approach => Using HashMap

class Second_Least_Frequent_Element_in_Array_using_hash{
    public static void main(String[] args){
        int [] arr = {1,1,2,2,2,3};

        int f_least = Integer.MAX_VALUE;
        int s_least = Integer.MAX_VALUE;

        int f_element = -1;
        int s_element = -1;
        HashMap<Integer , Integer>hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
        }

        for (int key : hm.keySet()){
            if (hm.get(key) < f_least){
                f_element = key;
                f_least = hm.get(key);
            }
        }

        for (int key : hm.keySet()){
            if (hm.get(key) < s_least && key != f_element){
                s_least = hm.get(key);
                s_element = key;
            }
        }
//        System.out.println(f_element);
        System.out.println("second least frequent element in an array : "+s_element);
    }
}

/*

OUTPUT :

second least frequent element in an array : 1

 */