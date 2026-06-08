/*
Given an integer array nums, return all the triplets
 [nums[i], nums[j], nums[k]] such that
 i != j,
 i != k,
 and j != k,
 and nums[i] + nums[j] + nums[k] == 0.
 */

import java.util.ArrayList;
import java.util.List;

public class Leetcode_15_3Sum {
    public static void main(String[] args){
        int [] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> al =  Solution15(arr);
        System.out.println(al);

    }
    public static List<List<Integer>> Solution15(int [] arr ){
        ArrayList<Integer> al1 = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i] + arr[j] + arr[k] == 0){
                        al1.add(arr[i]);
                        al1.add(arr[j]);
                        al1.add(arr[k]);
                    }
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(al1);
        return result;
    }
}
