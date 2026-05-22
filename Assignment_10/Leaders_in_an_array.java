import java.util.ArrayList;
import java.util.Collections;

public class Leaders_in_an_array {
    public static void main(String[] args){
        int [] arr = {38 , 17, 29 , 14 , 27 , 35 , 2 , 1};
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] > arr[i]) found = true;
            }
            if(!found){
                al.add(arr[i]);
            }
        }
        System.out.println(al);
    }
}
/*

OUTPUT :
[38, 35, 2, 1]

 */

class Leaders_in_an_array_optimal{
    public static void main(String[] args){
        int [] arr = {38 , 17, 29 , 14 , 27 , 35 , 2 , 1};
        ArrayList<Integer> al = new ArrayList<>();

        int point = arr[arr.length - 1];
        al.add(point);
        for (int i = arr.length - 2; i >= 0; i--) {

            if(arr[i] > point){
                point = arr[i];
                al.add(arr[i]);
            }
        }
        Collections.reverse(al);
        System.out.println(al);
    }
}
