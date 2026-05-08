import java.util.ArrayList;

class Demo{
    public static void main(String[] args){
        int [] arr = {1,2,4,-3,2,5,-8,4};
        int n = arr.length;

        int sum = 0;
        int max_sum = Integer.MIN_VALUE;

        ArrayList<Integer>current_list = new ArrayList<>();
        ArrayList<Integer>max_list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            current_list.add(arr[i]);

            if(sum > max_sum){
                max_sum = sum;
                max_list = new ArrayList<>(current_list);
            }
            if(sum < 0){
                sum = 0;
                current_list.clear();
            }
        }
        System.out.println(max_list);
    }
}

/*

OUTPUT :

[1, 2, 4, -3, 2, 5]

*/
