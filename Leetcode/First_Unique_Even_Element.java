import java.util.*;
public class First_Unique_Even_Element {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.print("Enter array elements : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        Solution3866 solution3866 = new Solution3866();
        System.out.println("First Unique even number : "+solution3866.firstUniqueEven(arr));
    }
}
class Solution3866{
    public int firstUniqueEven(int [] arr){
        for(int i = 0 ; i < arr.length ; i++){
            int count = 0;
            for(int j = 0 ; j < arr.length ; j++){
                if(arr[i] == arr[j] && arr[i] % 2 == 0){
                    count++;
                }
            }
            if(count == 1){
                return arr[i];
            }
        }
        return -1;
    }
}

/*
*
* OUTPUT :
Enter size of array : 2
Enter array elements : 4 4
First Unique even number : -1

Enter size of array : 6
Enter array elements : 3 4 2 5 4 6
First Unique even number : 2

*
*
* */
