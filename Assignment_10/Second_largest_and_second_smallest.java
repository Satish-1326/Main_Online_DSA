import java.util.*;
public class Second_largest_and_second_smallest {
    public static void main(String[] args){
        int [] arr = {5, 2, 8, 1, 9};

        int f_max = 0;
        int s_max = 0;
        int f_min = Integer.MAX_VALUE;
        int s_min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > f_max){
                f_max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > s_max && arr[i] != f_max){
                s_max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < f_min){
                f_min = arr[i];
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < s_min && arr[i] != f_min){
                s_min = arr[i];
            }
        }

//        System.out.println(f_max);
        System.out.println("Second maximum : "+s_max);
//        System.out.println(f_min);
        System.out.println("Second minimum : "+s_min);
    }
}
/*

OUTPUT :

Second maximum : 8
Second minimum : 2

 */

class Second_largest_and_second_smallest_using_hash{
    public static void main(String[] args){
        int [] arr = {5, 2, 8, 1, 9};
        HashMap<Integer , Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
        }

        int f_max = 0;
        int s_max = 0;
        int f_min = Integer.MAX_VALUE;
        int s_min = Integer.MAX_VALUE;


        for(int key : hm.keySet()){
            if( key > f_max){
                s_max = f_max;
                f_max = key;
            }else if(key > s_max && key != f_max){
                s_max = key;
            }

            if(key < f_min){
                s_min = f_min;
                f_min = key;
            }else if(key < s_min && key != f_min){
                s_min = key;
            }
        }
//        for(int key : hm.keySet()){
//            if(key > f_max){
//                f_max = key;
//            }
//        }
//        for(int key : hm.keySet()){
//            if(key > s_max && key != f_max){
//                s_max = key;
//            }
//        }
//        for(int key : hm.keySet()){
//            if(key < f_min){
//                f_min = key;
//            }
//        }
//        for(int key : hm.keySet()){
//            if(key < s_min && key != f_min){
//                s_min = key;
//            }
//        }

        System.out.println("Second maximum from the array : "+s_max);
        System.out.println("Second minimum from the array : "+s_min);
    }
}