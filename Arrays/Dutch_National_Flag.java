public class Dutch_National_Flag {
    public static void main(String[] args){
        int [] arr = {1,1,0,1,2,0,1,2};

        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid <= high){
            if(arr[mid] == 0 ){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }
            else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        System.out.print("Sorted Array using dutch national flag algo : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

/*

OUTPUT :

Sorted Array using dutch national flag algo : 0 0 1 1 1 1 2 2

 */
