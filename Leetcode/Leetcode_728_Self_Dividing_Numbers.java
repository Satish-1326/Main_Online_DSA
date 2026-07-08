import java.util.ArrayList;
import java.util.List;

public class Leetcode_728_Self_Dividing_Numbers {
    public static void main(String[] args){
        System.out.println(selfDividingNumbers(1,22));
    }
    public static List<Integer> selfDividingNumbers(int left , int right){
        List<Integer> al = new ArrayList<>();

        for (int i = left ; i <= right ; i++){
            int num = i;
            int original = num;
            boolean divideable = true;

            while (num != 0){
                int digit = num % 10;

                if(digit == 0 || original%digit != 0){
                    divideable = false;
                    break;
                }
                num = num/10;
            }
            if(divideable){
                al.add(original);
            }
        }
        return al;
    }
}
