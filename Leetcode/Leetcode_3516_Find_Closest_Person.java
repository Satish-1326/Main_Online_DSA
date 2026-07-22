public class Leetcode_3516_Find_Closest_Person {
    public static void main(String[] args){
        int x = 2;
        int y = 7;
        int z = 4;
        System.out.println(findClosest(x,y,z));
    }
    public static int findClosest(int x , int y , int z){
        int d1 = Math.abs(x - z);
        int d2 = Math.abs(y - z);

        if(d1 < d2){
            return 1;
        } else if (d2 < d1) {
            return 2;
        }
        return 0;
    }
}
