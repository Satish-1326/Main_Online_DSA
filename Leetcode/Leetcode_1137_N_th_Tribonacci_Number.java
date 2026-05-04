public class Leetcode_1137_N_th_Tribonacci_Number {
    public static void main(String[] args){
        int num = 5;
        int result = fun(num);
        System.out.println(result);
    }

    public static int fun(int num){
        if(num == 0){
            return num;
        }
        if(num == 1 || num == 2){
            return 1;
        }

        int last = fun(num - 1);
        int s_last = fun(num - 2);
        int t_last = fun(num - 3);

        return last+s_last+t_last;
    }
}
