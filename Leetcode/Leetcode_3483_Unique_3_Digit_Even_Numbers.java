import java.util.HashSet;

public class Leetcode_3483_Unique_3_Digit_Even_Numbers {
    public static void main(String[] args){
        int [] digits = {1,2,3,4};

        System.out.println(totalNumbers(digits));
    }
    public static int totalNumbers(int [] digits){
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < digits.length; i++) {

            if(digits[i] == 0){
                continue;
            }

            for (int j = 0; j < digits.length; j++) {

                if(j == i){
                    continue;
                }

                for (int k = 0; k < digits.length; k++) {

                    if (k == i || k == j){
                        continue;
                    }

                    if(digits[k] % 2 != 0){
                        continue;
                    }

                    int nums = digits[i]*100
                            +digits[j]*10
                            +digits[k];

                    set.add(nums);
                }
            }
        }
        return set.size();
    }
}
