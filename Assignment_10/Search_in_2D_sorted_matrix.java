public class Search_in_2D_sorted_matrix {
    public static void main(String[] args){
        int [][] arr = {
                {1,4,7},
                {2,5,8},
                {3,6,9}
        };

        int target = 5;
        boolean found = false;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                if(arr[i][j] == target){
                    found = true;
                }
            }
        }
        System.out.print("Element found :"+found);
    }
}

/*

OUTPUT
Element found :true

 */
