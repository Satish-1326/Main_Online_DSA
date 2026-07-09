import java.util.Arrays;

public class Leetcode_2418_Sort_the_People {
    public static void main(String[] args){
        String [] names = {"Mary","John","Emma"};
        int [] heights = {180,165,170};
        System.out.println(Arrays.toString(sortPeople(names,heights)));
    }
    public static String[] sortPeople(String[] names , int [] height){

        int n = height.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {

                if(height[i] < height[j]){

                    //move heights
                    int temp = height[i];
                    height[i] = height[j];
                    height[j] = temp;

                    //move names
                    String name = names[i];
                    names[i] = names[j];
                    names[j] = name;
                }
            }
        }
        return names;
    }
}
