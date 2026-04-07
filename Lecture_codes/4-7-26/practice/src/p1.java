class Demp{
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        int c = b;
//
//         b = a;
//         a = c;
//
//        System.out.println(a);
//        System.out.println(b);
        int [] arr = {7, 5, 3 , 2 , 1};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                System.out.print(arr[min_index]+" ");
                if(arr[j] < arr[min_index]){
                    min_index = j;
                    System.out.print(arr[min_index]+" ");
                }
            }


            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
