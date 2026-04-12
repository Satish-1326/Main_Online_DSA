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

class Sorting{
    public static void main(String[] args){
        int [] arr = {18,8,7,21,9,38,29,12,3,2,1};
        int low = 0 ;
        int high = arr.length-1;

        f(arr , low , high);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void f(int [] arr , int low , int high){
        if(low>= high){
            return;
        }
        int mid = (low+high) / 2;

        f(arr,low,mid);
        f(arr,mid+1 , high);
        merge(arr,low,mid,high);
    }
    public static void merge(int [] arr , int low , int mid , int high){
        int [] merged = new int[high-low+1];
        int blue = low;
        int green = mid+1;
        int red = 0;

        while (blue <= mid && green <= high){
            if(arr[blue] <= arr[green]){
                merged[red] = arr[blue];
                red++;
                blue++;
            }else {
                merged[red] = arr[green];
                red++;
                green++;
            }
        }
        while (blue <= mid){
            merged[red] = arr[blue];
            red++;
            blue++;
        }
        while (green <= high){
            merged[red] = arr[green];
            red++;
            green++;
        }
        for (int i = 0; i < merged.length; i++) {
            arr[low+i] = merged[i];
        }
    }
}
