public class Leetcode_2079_Watering_Plants {
    public static void main(String[] args){
        int [] plants = {2,2,3,3};
        int result = Solution2079(plants , 5);
        System.out.println(result);
    }
    public static int Solution2079(int [] plants , int capacity){
        int steps = 0;
        int water = capacity;

        for (int i = 0; i < plants.length; i++) {
            if(water < plants[i]){
                steps += 2*i;
                water = capacity;
            }
            steps++;
            water -= plants[i];
        }
        return steps;
    }
}
