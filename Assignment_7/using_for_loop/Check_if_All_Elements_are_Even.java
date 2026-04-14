public class Check_if_All_Elements_are_Even {
    public static void main(String[] args){
        int [] arr = {2,4,6};
        boolean result = false;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                result = true;
            }
        }
        System.out.println("true if all elements are even : "+result);
    }
}

/*

OUTPUT :

true if all elements are even : true

 */

class Freq_grater{
    public static void main(String[] args){
        int [] arr = {1,1,2,2,2,3,3};
        int k = 2;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > k){
                result = arr[i];
            }
        }
        System.out.println(result);
    }
}
