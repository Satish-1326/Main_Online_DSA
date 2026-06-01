import java.util.*;
class Length_of_the_longest_subarray{
	public static void main(String[]args){

	int [] arr = {10, 5, 2, 7, 1, -10};
	int k = 15;

	int max = 0;

	ArrayList<Integer> al = new ArrayList<>();

	for(int i = 0 ; i < arr.length ; i++){
		int sum = 0;
		al.clear();
		for(int j = i ; j < arr.length ; j++){
			sum += arr[j];

			if(sum == k){
				int len = j - i + 1;
				max = Math.max(max , len);
				}
			
			}
		}
		System.out.print(max);
	}
}