import java.util.Arrays;
import java.util.Stack;

public class Leetcode_735_Asteroid_Collision {
    public static void main(String[] args){
        int [] arr = {5,10,-5};
        System.out.println(Arrays.toString(asteroidCollision(arr)));
    }
    public static int [] asteroidCollision(int [] arr){
        Stack<Integer> st = new Stack<>();

        for (int i = 0 ; i < arr.length; i++){
            int current = arr[i];
            while (!st.isEmpty() && st.peek() > 0 && current < 0){

                if(st.peek() < -current){
                    st.pop();
                } else if (st.peek() == -current) {
                    st.pop();
                    current = 0;
                    break;
                }else{
                    current = 0;
                    break;
                }
            }
            if(current != 0){
                st.push(current);
            }
        }
        int [] result = new int[st.size()];
        for (int i = result.length-1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }
}
