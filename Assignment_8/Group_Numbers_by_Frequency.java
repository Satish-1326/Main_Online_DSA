//Q12. Group Numbers by Frequency


// 1st Approach => Using Broot Force
import java.util.*;
public class Group_Numbers_by_Frequency {
    public static void main(String[] args){
        int [] arr = {3,5,1,1,2,2};

        int [] result = new int[arr.length];
        int [] result2 = new int[arr.length];

        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean visited = false;
            for (int k = 0; k < i; k++) {
                   if (arr[i] == arr[k]){
                       visited = true;
                       break;
                   }
            }

            if(visited) continue;
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
//            System.out.println(count + " : "+ arr[i] );
            if(count == 1){
//                System.out.print(+arr[i]+" ");
                result[index1++] = arr[i];
            }
            if (count == 2){
                result2[index2++] = arr[i];
            }
        }

        System.out.println();
        for (int i = 0; i < index1; i++) {
                System.out.print(result[i] +" ");
        }

        System.out.println();
        for (int i = 0; i < index2; i++) {
                System.out.print(result2[i]+" ");
        }

    }
}
