import java.util.Arrays;
import java.util.Stack;

public class Leetcode_739_Daily_Temperatures {
    public static void main(String[] args){
        int [] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
    public static int [] dailyTemperatures(int [] temperatures){
        int [] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            result[i] = 0;
            for (int j = i+1; j < temperatures.length; j++) {
                if(temperatures[i] < temperatures[j]){
                    result[i] = j - i;
                    break;
                }
            }
        }
        return result;
    }
}

class Leetcode_739_Daily_Temperatures_Using_Stack{
    public static void main(String[] args){
        int [] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
    public static int [] dailyTemperatures(int [] temperatures){
        int [] result = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();

        for (int i = temperatures.length-1; i >= 0 ; i--) {
            while (!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                result[i] = st.peek() - i;
            }
            st.push(i);
        }
        return result;
    }
}
