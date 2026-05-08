import java.util.*;
class Demo{
	public static void main(String[]args){
	
	int [] arr = {1,2,-4,3,6,8,-14,-3,-2};
	int max = Integer.MIN_VALUE;

	for(int i = 0 ; i < arr.length ; i++){
		int product = 1;
		for(int j = i ; j < arr.length ; j++){
			product = product*arr[j];

			max = Math.max(max , product);
			}
		}
	System.out.print(max);
	}
}
