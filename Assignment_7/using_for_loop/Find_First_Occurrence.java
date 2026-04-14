public class Find_First_Occurrence {
    public static void main(String[] args){
        int [] arr = {5,2,3,2,4};
        int target = 2;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                result = i;
                break;
            }
        }
        System.out.println("index of first occurrence of targe : "+result);
    }
}

/*

OUTPUT :

index of first occurrence of targe : 1

 */
