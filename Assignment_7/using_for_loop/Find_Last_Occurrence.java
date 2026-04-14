public class Find_Last_Occurrence {
    public static void main(String[] args){
        int [] arr = {5,2,3,2,4};
        int target = 2;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                result = i;
            }
        }
        System.out.println("index of last occurrence of target : "+result);
    }
}

/*

OUTPUT :

index of last occurrence of target : 3

 */
