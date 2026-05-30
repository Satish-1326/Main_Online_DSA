public class Find_the_Highest_Altitude {
    public static void main(String[] args){
        int [] arr = {-5,1,5,0,-7};

        int max = 0;
        int alt = 0;

        for (int i = 0; i < arr.length; i++) {
            alt += arr[i];

            if(alt > max){
                max = alt;
            }
        }
        System.out.println(max);
    }
}
