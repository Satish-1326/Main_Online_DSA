import java.util.*;
public class Union_using_treemap {
    public static void main(String[] args){
        int [] arr = {1,2,3};
        int [] arr1 = {3,4,5};

        TreeMap<Integer , Integer> tm = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {
            tm.put(arr[i] , tm.getOrDefault(arr[i] , 0)+1);
        }
        for (int i = 0; i < arr1.length; i++) {
            tm.put(arr1[i] , tm.getOrDefault(arr1[i] , 0)+1);
        }

        ArrayList<Integer> al = new ArrayList<>();
        for(int key : tm.keySet()){
            al.add(key);
        }
        System.out.print("All union elements : ");
        System.out.print(al);
    }
}

/*

OUTPUT :

All union elements : [1, 2, 3, 4, 5]

 */

// Approach 2nd => Using merge sort

class Union_using_merge {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int [] arr2 = {3,4,5};

        int m = arr1.length;
        int n = arr2.length;

        int i = 0;
        int j = 0;

        ArrayList<Integer> al = new ArrayList<>();

        while (i < n && j < m){
            if(arr1[i] < arr2[j]){
                if(al.isEmpty() || al.get(al.size() - 1) != arr1[i]){
                    al.add(arr1[i]);
                }
                i++;
            }
            else if(arr1[i] > arr2[j]){
                if(al.isEmpty() || al.get(al.size() - 1) != arr2[j]){
                    al.add(arr2[j]);
                }
                j++;
            }
            else{
                if(al.isEmpty() || al.get(al.size() - 1) != arr1[i]){
                    al.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while (i < m){
            if(al.isEmpty() || al.get(al.size() - 1) != arr1[i]){
                al.add(arr1[i]);
            }
            i++;
        }
        while(j < n){
            if(al.isEmpty() || al.get(al.size() - 1) != arr2[j]){
                al.add(arr2[j]);
            }
            j++;
        }
        System.out.print(al);
    }
}
