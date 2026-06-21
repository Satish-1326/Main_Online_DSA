import java.util.ArrayList;
import java.util.HashMap;

public class Most_frequent_Even_Element {
    public static void main(String[] args){
        int [] nums = {0,1,2,2,4,4,1};
        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int i = 0 ; i < nums.length; i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0)+1);
        }
        int maxFreq = 0;
        int ans = -1;

        for(int key : hm.keySet()){
            if(key % 2 == 0){
                int freq = hm.get(key);

                if(freq > maxFreq){
                    maxFreq = freq;
                    ans = key;
                }
                else if(freq == maxFreq && key < ans){
                    ans = key;
                }
            }
        }
        System.out.println(ans);
    }
}

class Demo{
    public static void main(String[] args){
        int [] arr = {-1,-2,-3,0,1,3};

        boolean [] arr1 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= 0){
                arr1[i] = false;
            }else{
                arr1[i] = true;
            }
        }

        int low = 0;
        int high = arr1.length-1;
        int ans = -1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr1[mid]){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        if(ans != -1){
            System.out.println(arr[ans]);
            System.out.println(ans);
        }
    }
}

class Find_last_Neg{
    public static void main(String[] args){
        int [] arr = {-10,-8,-5,-2,3,7};
        boolean [] arr1 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                arr1[i] = true;
            }else{
                arr1[i] = false;
            }
        }
        int low = 0;
        int high = arr1.length-1;
        int ans = -1;

        while(low <= high){
            int mid = low+(high-low);
            if(arr1[mid]){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        System.out.println(ans);
    }
}

class Find_the_first_even{
    public static void main(String[] args){
        int [] arr = {1,3,7,9,10,12};
        boolean [] arr1 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                arr1[i] = true;
            }else{
                arr1[i] = false;
            }
        }
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr1[mid]){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        System.out.println(ans);
    }
}

class Find_first_odd_num{
    public static void main(String[] args){
        int [] arr = {2,4,6,8,10,11,13};
        boolean [] arr1 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                arr1[i] = true;
            }
            else{
                arr1[i] = false;
            }
        }
        int low = 0;
        int high = arr1.length-1;
        int ans = -1;
        while (low <= high){
            int mid = low+(high-low)/2;
            if(arr1[mid]){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(ans);
    }
}

class First_Element_greate_than_equal_k{
    public static void main(String[] args){
        int [] arr = {1,2,4,4,4,4,7,8};
        int k = 4;
        boolean [] arr1 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= k){
                arr1[i] = true;
            }
            else{
                arr1[i] = false;
            }
        }
        int low = 0;
        int high = arr1.length-1;
        int ans = -1;
        while (low <= high){
            int mid = low+(high-low)/2;
            if(arr1[mid]){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        System.out.println(ans);
    }
}

class Elemenet_stricktly_greater_than_k{
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6};
        int k = 4;
        boolean [] arr1 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > k){
                arr1[i] = true;
            }else{
                arr1[i] = false;
            }
        }
        int low = 0;
        int high = arr1.length-1;
        int ans = -1;
        while (low <= high){
            int mid = low+(high-low)/2;
            if(arr1[mid]){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }
        System.out.println(ans);
    }
}

class Count_occurance_using_upper_and_lower_bound{
    public static void main(String[] args){
        int [] arr = {1,2,4,4,4,7,9};
        int ans = solutionDiff(arr,4);
        System.out.println(ans);
    }
    public static int solutionDiff(int [] arr , int k){
        int LowerBound = lowerBound(arr,k);
        int UpperBound = upperBound(arr,k);
        return UpperBound-LowerBound;
    }
    public static int lowerBound(int [] arr , int k){
        boolean [] arr1 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= k){
                arr1[i] = true;
            }else{
                arr1[i] = false;
            }
        }
        int low = 0;
        int high = arr1.length;;
        int lowerBound = -1;
        while (low <= high){
            int mid = low+(high-low)/2;
            if(arr1[mid]){
                lowerBound = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return lowerBound;
    }
    public static int upperBound(int [] arr , int k){
        boolean [] arr1 = new boolean[arr.length];
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] > k){
                arr1[i] = true;
            }else{
                arr1[i] = false;
            }
        }
        int low = 0;
        int high = arr.length-1;
        int upperBound = -1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr1[mid]){
                upperBound = mid;
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }
        return upperBound;
    }
}

class LowerBound{
    public static void main(String[] args){
        int [] arr = {1,2,4,4,4,7,9};
        System.out.println(lowerBound(arr,4));
    }
    public static int lowerBound(int [] arr , int k){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while (low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid] >= k){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}

class UpperBound{
    public static void main(String[] args){
        int [] arr = {1,2,4,4,4,7,9};
        System.out.println(lowerBound(arr,4));
    }
    public static int lowerBound(int [] arr , int k){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while (low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid] > k){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}

