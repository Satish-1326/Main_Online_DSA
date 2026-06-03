import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Leetcode_2215_Find_the_Difference_of_Two_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 4, 6};
        List<List<Integer>> ls = Solution2215(arr1, arr2);
        System.out.println(ls);
    }

    public static List<List<Integer>> Solution2215(int[] arr1, int[] arr2) {
        List<List<Integer>> listOfList = new ArrayList<>();
        List<Integer> al1 =  new ArrayList<>();
        List<Integer> al2 = new ArrayList<>();

        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        for(int i = 0 ; i < arr1.length ; i++){
            hs1.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            hs2.add(arr2[i]);
        }

        for(int ele : hs1){
            if(!hs2.contains(ele)){
                al1.add(ele);
            }
        }
        for(int ele : hs2){
            if(!hs1.contains(ele)){
                al2.add(ele);
            }
        }
        listOfList.add(al1);
        listOfList.add(al2);

        return listOfList;
    }
}
