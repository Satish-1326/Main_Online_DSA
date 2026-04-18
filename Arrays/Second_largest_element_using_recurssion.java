public class Second_largest_element_using_recurssion {
    public static void main(String[] args){
        int [] arr = {5,7,9,1,3,4,13};
        int f_max = f(arr , 0);
        int s_max = f2(arr , 0 , f_max);

        System.out.println("First maximum number from array : "+f_max);
        System.out.println("Second maximum number form array : "+s_max);
    }
    public static int f(int [] arr , int index){
        if(index == arr.length - 1){
            return arr[index];
        }
        int max = f(arr , index+1);
        return Math.max(arr[index] , max);
    }
    public static int f2(int [] arr , int index , int f_max){
        if(index == arr.length){
            return 0;
        }
        int s_max = f2(arr , index+1 , f_max);
        if(arr[index] == f_max){
            return s_max;
        }
        return Math.max(arr[index] , s_max);
    }
}

/*

OUTPUT :

First maximum number from array : 13
Second maximum number form array : 9

 */
