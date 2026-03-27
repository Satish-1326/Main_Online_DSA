import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter total number of people : ");
	int n = sc.nextInt();
	int index = 0;
	int sum = 0 ;

	System.out.print("Enter a maximum weight of balloan : ");
	int target = sc.nextInt();

	
	int [] arr = new int[n];
	for(int i = 0 ; i < arr.length ; i++){
		arr[i] = sc.nextInt();
		}
	Arrays.sort(arr);
	int result = findTotalPeople(n,sum,target,arr,index);
	System.out.print(result);
	}

	static int findTotalPeople(int n , int sum , int target , int [] arr,int index){
		if(index == n){
			return -1;
		}

	sum += arr[index];
	if(sum > target){
		return index;
		}
	return findTotalPeople(n , sum,target,arr,index+1);
	}
}