import java.util.ArrayList;
import java.util.List;

public class Leetcode_216_Combination_Sum_III {
    public static void main(String[] args){

        System.out.println(combi(3,7));
    }
    public static List<List<Integer>> combi(int k , int n){
        List<List<Integer>> ans = new ArrayList<>();

        fun(k , n , 1 , new ArrayList<Integer>() , ans);

        return ans;
    }
    public static void fun(int k , int n , int i , ArrayList<Integer>list , List<List<Integer>> ans){

        if(k == 0 && n == 0){
            ans.add(new ArrayList<>(list));
            return;
        }

        if(i > 9 || k == 0 || n < 0){
            return;
        }

        list.add(i);
        fun(k-1 , n-i , i+1 , list,ans);
        list.remove(list.size() - 1);
        fun(k , n , i+1 , list , ans);
    }
}
