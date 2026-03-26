import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter size of array : ");
	int n = sc.nextInt();
	
	int [] arr = new int[n];

	System.out.print("Enter array elements : ");
	for(int i = 0 ; i < n ; i++){
		arr[i] = sc.nextInt();
	}

	int min = fun(arr,0);
	System.out.print("Minimun number in array : "+min);
	}
	
	static int fun(int [] arr , int i){
		if(i == arr.length-1){
			return arr[i];
		}

	int minimum = fun(arr,i+1);
	return Math.min(arr[i] , minimum);
	}
}

/*

OUTPUT :

Enter size of array : 5
Enter array elements : 55 15 2 20 25
Minimun number in array : 2

*/