public class Find_First_Even {
    public static void main(String[] args){
        int [] arr = {1,3,7,9,10,12};
        System.out.println(firstEven(arr));
    }
    public static int firstEven(int [] arr){
        boolean [] arr1 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                arr1[i] = true;
            }else arr1[i] = false;
        }

        int low = 0;
        int high = arr1.length-1;
        int ans = -1;
        while (low <= high){
            int mid = low+(high-low)/2;
            if(arr1[mid]){
                ans = mid;
                high = mid-1;
            }else low = mid+1;
        }
        return ans;
    }
}


class Shubham_mane_code{
    public static void main(String[] args){
        int n = 135;
        int original = n;
        int sum = 0;

        String num = String.valueOf(n);
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            sum += Math.pow(digit, i+1);
        }
        System.out.println(sum);
    }
}
