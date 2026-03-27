import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	

	System.out.print("Enter number of people : ");
	int n =sc.nextInt();

	// sum veriable to compare with target weight
	int sum = 0;

	System.out.print("Enter a target weight : ");
	int target = sc.nextInt();

	// Array declare kela aani tyala size dili
	int [] arr = new int[n];

	System.out.print("Enter weight of each person : ");
	for(int i = 0 ; i< n ; i++){
		arr[i] = sc.nextInt();
	}	

	// Sorting array by using inbuild method
	Arrays.sort(arr);

	int result = 0 ;
	for(int i = 0 ; i <= arr.length-1 ; i++){
		sum += arr[i];
		if(sum > target){
			result = i ;
			break;
			}
		}
	System.out.print("Total person allowed : "+result);
	}
}