import java.util.HashMap;

public class Q4 {
    public static void main(String[] args){
        int [] arr = {12 , 35 , 1 , 10 , 34 , 1};
        int f_max = Integer.MIN_VALUE;
        int s_max = Integer.MIN_VALUE;

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
        System.out.println(s_max);
    }
}

class Q4_app_2{
    public static void main(String[] args){
        int [] arr = {12, 35, 1, 10, 34, 1};

        int f_max = Integer.MIN_VALUE;
        int s_max = Integer.MIN_VALUE;

        HashMap<Integer , Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i] , i);
        }

        for(int key : hm.keySet()){
            if(key > f_max){
                f_max = key;
            }
        }
        for(int key : hm.keySet()){
            if(key > s_max && key != f_max){
                s_max = key;
            }
        }
        System.out.println("Second Maximum in the array : "+s_max);
    }
}
/*

OUTPUT :
Second Maximum in the array : 34

 */
