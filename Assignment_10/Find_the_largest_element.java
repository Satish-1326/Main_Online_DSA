import java.util.*;
public class Find_the_largest_element {
    public static void main(String[] args){
        int [] arr = {2, 7, 1, 9, 5};
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum number from array : "+max);
    }
}

/*

OUTPUT :

Maximum number from array : 9

 */


class Find_the_largest_element_using_hash{
    public static void main(String[] args){
        int [] arr = {1, 2, 3, 5};
        int max = 0;

        HashMap<Integer , Integer>hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
        }

        for(int key : hm.keySet()){
            if(key > max){
                max = key;
            }
        }
        System.out.println("Maximum elements from the array : "+max);
    }
}

/*

OUTPUT :

Maximum elements from the array : 5

 */