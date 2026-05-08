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



///  LECTURE CODES FOR PRACTICE
class pract{
    public static void main(String[] args){
        int [] arr = {1,2,-4,3,6,8,-14,-3,-2};
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if(sum < 0){
                sum = 0;
            }
            if(sum > max){
                max =sum;
            }
        }
        System.out.println(max);
    }
}

class lect{
    public static void main(String[] args){
        int [] arr = {1,2,-4,3,6,8,-14,-3,-2};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];

                if(sum > max){
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}


