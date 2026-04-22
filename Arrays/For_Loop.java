import java.util.*;
public class For_Loop {
    public static void main(String[] args){
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1 ; j--) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
class Demo5{
    public static void main(String[] args){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*"+" ");
            }
            for (int j = 1; j <= 2*(n - i); j++) {
                System.out.print("-"+" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*"+" ");
            }
            for (int j = 1; j <= 2*(n-i) ; j++) {
                System.out.print("-"+" ");
            }
            for (int j = i; j >= 1 ; j--) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

class lecture{
    public static void main(String[] args){
        int [] arr = {1,1,0,1,2,0,1,2};
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}


class tree {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 2, 0, 1, 2};

        int o_count = 0;
        int one_count = 0;
        int two_count = 0;

        for (int i = 0; i < arr.length  ; i++) {
            if(arr[i] == 0){
                o_count++;
            }
            if(arr[i] == 1){
                one_count++;
            }
            if(arr[i] == 2){
                two_count++;
            }
        }
        int [] result = new int[arr.length];
        int i = 0;

        while (o_count > 0){
            result[i] = 0;
            i++;
            o_count--;
        }
        while (one_count > 0){
            result[i] = 1;
            i++;
            one_count--;
        }
        while (two_count > 0){
            result[i] = 2;
            two_count--;
            i++;
        }

        for (int j = 0; j < result.length; j++) {
            System.out.print(result[j]+" ");
        }
    }
}
