public class Leetcode_3751_Total_Waviness_of_Numbers_in_Range_I {
    public static void main(String[] args){
        System.out.println(totalWaviness(120,130));
    }
    public static int totalWaviness(int num1, int num2){
        int count = 0;

        for (int i = num1; i <= num2 ; i++) {
            String s = String.valueOf(i);

            for (int j = 1; j < s.length()-1; j++) {
                int left = s.charAt(j-1) - '0';
                int current = s.charAt(j) - '0';
                int right = s.charAt(j+1) - '0';

                if(current > left && current > right){
                    count++;
                } else if (current < left && current < right) {
                    count++;
                }
            }
        }
        return count;
    }
}
