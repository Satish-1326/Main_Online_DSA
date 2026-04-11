class Demo{
    public static void main(String[] args){
        int [] arr1 = {1,4,7};
        int [] arr2 = {2,3,6};

        int [] merged = new int[arr1.length+ arr2.length];
        int blue = 0 ;
        int green = 0;
        int red = 0;

        while (blue < arr1.length && green < arr2.length){
            if(arr1[blue] <= arr2[green]){
                merged[red] = arr1[blue];
                red++;
                blue++;
            }else {
                merged[red] = arr2[green];
                red++;
                green++;
            }
        }
        while (blue < arr1.length){
            merged[red] = arr1[blue];
            red++;
            blue++;
        }
        while (green < arr2.length){
            merged[red] = arr2[green];
            red++;
            green++;
        }

        for (int i = 0; i < merged.length; i++) {
            System.out.println(merged[i] +" ");
        }
    }
}
