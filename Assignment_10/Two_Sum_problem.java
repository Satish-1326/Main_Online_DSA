import java.util.ArrayList;

public class Two_Sum_problem {
    public static void main(String[] args){
        int [] arr = {1, 7, 11, 15 , 2};
        int target = 9;

        int [] result = new int[2];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    result[k++] = i;
                    result[k] = j;
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}

class Two_Sum_problem_using_al{
    public static void main(String[] args){
        int [] arr = {1, 7, 11, 15 , 2};
        int target = 9;

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    al.add(i);
                    al.add(j);
                }
                if(al.size() == 2){
                    break;
                }
            }
        }
        System.out.println(al);
    }
}


