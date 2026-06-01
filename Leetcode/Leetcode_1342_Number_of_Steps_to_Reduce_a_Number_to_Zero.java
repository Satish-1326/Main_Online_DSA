public class Leetcode_1342_Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public static void main(String[] args){
        int num = 8;
        int steps = 0;

        while (num != 0){
            if(num % 2 == 0){
                num = num / 2;
                steps++;
            }else {
                num = num - 1;
                steps++;
            }
        }
        System.out.println(steps);
    }
}
