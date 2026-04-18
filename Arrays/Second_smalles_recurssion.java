public class Second_smalles_recurssion {
    public static void main(String[] args){
        int [] arr = {5,7,9,1,3,4,13};
        int f_small = f(arr , 0);
        int s_small = f2(arr , 0 , f_small);
        System.out.println("First smallest element in array : "+f_small);
        System.out.println("Second smallest element in array : "+s_small);
    }
    public static int f(int [] arr , int i){
        if(i == arr.length-1){
            return arr[i];
        }
        int min = f(arr , i+1);
        return Math.min(arr[i] , min);
    }
    public static int f2(int [] arr , int i , int f_min){
        if(i == arr.length){
            return Integer.MAX_VALUE;
        }
        int s_min = f2(arr , i+1 , f_min);
        if(arr[i] == f_min){
            return s_min;
        }
        return Math.min(arr[i] , s_min);
    }
}

/*

OUTPUT :

First smallest element in array : 1
Second smallest element in array : 3

 */
