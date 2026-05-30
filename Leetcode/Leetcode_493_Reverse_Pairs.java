public class Leetcode_493_Reverse_Pairs {
    public static void main(String[] args){
        int [] arr = {1,3,2,3,1};
        Solution493 solution493 = new Solution493();
        System.out.println(solution493.reversePair(arr));
    }
}
class Solution493{
    public int reversePair(int [] arr){
        return f(arr , 0 , arr.length - 1);
    }
    public static int f(int [] arr , int low , int high){
        if(low >= high){
            return 0;
        }
        int mid = (low + high) / 2;
        int count = 0;

        count += f(arr , low , mid);
        count += f(arr , mid+1 , high);
        count += pairs(arr , low , mid , high);
        merge(arr , low , mid , high);
        return count;
    }
    public static int pairs(int [] arr , int low , int mid , int high){
        int count = 0;
        int green = mid + 1;
        for(int blue = low ; blue <= mid ; blue++){
            while (green <= high && arr[blue] > 2L * arr[green]){
                green++;
            }
            count += (green - (mid + 1));
        }
        return count;
    }
    public static void merge(int [] arr , int low , int mid , int high){
        int [] merged = new int[high - low + 1];
        int blue = low ;
        int green = mid + 1;
        int red = 0;

        while (blue <= mid && green <= high){
            if(arr[blue] <= arr[green]){
                merged[red] = arr[blue];
                red++;
                blue++;
            }
            else{
                merged[red] = arr[green];
                red++;
                green++;
            }
        }
        while (blue <= mid){
            merged[red] = arr[blue];
            red++;
            blue++;
        }
        while (green <= high){
            merged[red] = arr[green];
            red++;
            green++;
        }
        for (int i = 0; i < merged.length; i++) {
            arr[low + i] = merged[i];
        }
    }
}
