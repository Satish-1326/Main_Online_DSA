class Demo{
    public static void main(String[] args){
        int [] arr = {3,7,5,2,6};
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            boolean visited = false;
            for (int j = 0; j < n - i - 1 ; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    visited = true;
                }
            }
            if (!visited){
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}