import java.util.ArrayList;

public class Leetcode_2221_Find_Triangular_Sum_of_an_Array {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int sum = arr[i] + arr[i+1];
            al.add(sum);
        }
        System.out.println(al);

        ArrayList<Integer> sum1 = new ArrayList<>();
        for (int i = 0; i < al.size() - 1; i++) {
            int sum = al.get(i) + al.get(i+1);
            int last = sum % 10;
            sum1.add(last);
        }
        System.out.println(sum1);

        ArrayList<Integer> sum2 = new ArrayList<>();
        for (int i = 0; i < sum1.size() - 1; i++) {
            int sum = sum1.get(i) + sum1.get(i+1);
            int last = sum % 10;
            sum2.add(last);
        }
        System.out.println(sum2);

        ArrayList<Integer> sum3 = new ArrayList<>();
        for (int i = 0; i < sum2.size() - 1; i++) {
            int sum = sum2.get(i) + sum2.get(i+1);
            int last = sum % 10;
            sum3.add(last);
        }
        System.out.println(sum3);
    }
}

class Leetcode_2221_Find_Triangular_Sum_of_an_Array_optimal{
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        int n = arr.length;
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
        }
//        System.out.println(list);
        while(list.size() > 1) {
            ArrayList<Integer> final_r = new ArrayList<>();
            for (int i = 0; i < list.size() - 1; i++) {
                int sum = list.get(i) + list.get(i + 1);
                int result = sum % 10;
                final_r.add(result);
            }
            list = final_r;
        }
        System.out.println(list);
    }
}

/*

OUTPUT :
[8]

 */
