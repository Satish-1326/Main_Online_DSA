// Find element appearing more than n/3 times

import java.util.ArrayList;
import java.util.HashMap;

public class Quetion_24 {
    public static void main(String[] args){

        int [] arr = {3, 2, 3, 1, 2, 2};
        ArrayList<Integer> al = new ArrayList<>();

        int n = arr.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > n / 3){
                if(!al.contains(arr[i])){
                    al.add(arr[i]);
                }
            }
        }
        System.out.println(al);
    }
}


class Quetion_24_using_freq{
    public static void main(String[] args){
        int [] arr = {1,2};
        int n = arr.length;

        int max = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int [] freq = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (int a = 0; a < freq.length; a++) {
            if(freq[a] > n / 3){
                if(!al.contains(a)){
                    al.add(a);
                }
            }
        }
        System.out.println(al);
    }
}


class Quetion_24_using_hashmap{
    public static void main(String[] args){
        int [] arr = {3, 2, 3, 1, 2, 2};
        int n = arr.length;

        HashMap<Integer , Integer> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int count = hm.getOrDefault(arr[i] , 0)+1 ; hm.put(arr[i] , count);
            if(count > n / 3){
                if(!al.contains(arr[i])){
                    al.add(arr[i]);
                }
            }
        }
        System.out.println(al);
    }
}