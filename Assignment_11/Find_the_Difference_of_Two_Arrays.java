import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Find_the_Difference_of_Two_Arrays {
    public static void main(String[] args){
        int [] arr1 = {1,2,3,3};
        int [] arr2 = {1,1,2,2};

        List<List<Integer>> listOfList = new ArrayList<>();

        List<Integer> ls1 = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set2.add(arr2[i]);
        }

        for(int ele : set1){
            if(!set2.contains(ele)){
                ls1.add(ele);
            }
        }
        for(int ele : set2){
            if(!set1.contains(ele)){
                ls2.add(ele);
            }
        }
        listOfList.add(ls1);
        listOfList.add(ls2);

        System.out.println(listOfList);
    }
}
