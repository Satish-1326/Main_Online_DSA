public class Leetocde_4_Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3};
        int[] arr2 = {2,4};
        double result = Solution4(arr1, arr2);

        System.out.println(result   );

    }

    public static double Solution4(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] result = new int[m + n];

        int blue = 0 ;
        int green = 0 ;
        int red = 0;

        while (blue < m && green < n){
            if(arr1[blue] <= arr2[green]){
                result[red] = arr1[blue];
                red++;
                blue++;
            }else{
                result[red] = arr2[green];
                red++;
                green++;
            }
        }

        while (blue < arr1.length){
            result[red] = arr1[blue];
            red++;
            blue++;
        }
        while (green < arr2.length){
            result[red] = arr2[green];
            red++;
            green++;
        }

        double mid = 0;
        if(result.length % 2 == 1){
            mid = result[result.length / 2];
        }else {
            mid = (result[result.length / 2 -1] +
                    result[result.length / 2]) / 2.0;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
        return mid;
    }
}
