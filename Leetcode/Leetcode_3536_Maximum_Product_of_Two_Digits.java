import java.util.ArrayList;
import java.util.List;

public class Leetcode_3536_Maximum_Product_of_Two_Digits {
    public static void main(String[] args){
        int n = 31;
        System.out.println(maxProduct(n));
    }
    public static int maxProduct(int n){
        List<Integer> al = new ArrayList<>();
        int temp = n;
        while(temp != 0){
            int digit = temp % 10;
            al.add(digit);
            temp = temp / 10;
        }

        int max = -1;
        for (int i = 0; i < al.size(); i++) {
            for (int j = i+1; j < al.size(); j++) {
                if(al.get(i) * al.get(j) > max){
                    max = al.get(i)*al.get(j);
                }
            }
        }
        return max;
    }
}
