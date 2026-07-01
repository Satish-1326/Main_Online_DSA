public class Nth_Root {
    public static void main(String[] args){
        int n = 3;
        int num = 27;
        System.out.println(nthRoot(n,num));
    }
    public static int nthRoot(int n , int num){
        int low = 1;
        int high = num;

        while (low <= high){
            int mid = low+(high-low)/2;
            long pov = 1;

            for (int i = 0; i < n; i++) {
                pov *= mid;
            }
            if(pov == num){
                return mid;
            }else if(pov <= num){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}
