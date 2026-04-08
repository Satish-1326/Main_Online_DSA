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
        int [] arr = {7,3,5,6,1};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

/*

OUTPUT :

1 3 5 6 7

 */
