public class Max_row_sum {
    public static void main(String[] args){
        int [][] arr = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
        };
        int main_max = 0;
        int index = 0;
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum = sum + arr[i][j];
            }
            if(sum > main_max){
                main_max = sum;
                index = i;
            }
        }
        System.out.println("Index : "+index+", Max Sum : "+main_max);
    }
}
