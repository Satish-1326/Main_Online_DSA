public class Second_smalles_one {
    public static void main(String[] args){
        int [] arr = {5,7,9,1,3,4,13};
        int f_small = Integer.MAX_VALUE;
        int s_small = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < f_small){
                f_small = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < s_small && arr[i] != f_small){
                s_small = arr[i];
            }
        }
        System.out.println("First small element from the array : "+f_small);
        System.out.println("First small element from the array : "+s_small);
    }
}

/*

OUTPUT :

First small element from the array : 1
First small element from the array : 3

 */
