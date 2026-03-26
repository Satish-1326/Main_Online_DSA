import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a size of array : ");
	int n = sc.nextInt();

	int [] arr = new int[n];

	System.out.print("Enter elements of array : ");
	for(int i = 0 ; i< n ; i++){
		arr[i] = sc.nextInt();
	}


	int max = fun(arr,0);
	System.out.print("Maximum element in the array : "+max);
	}

	static int fun(int [] arr , int i){
		if(i == arr.length-1){
			return arr[i];
		}
	int maximum = fun(arr , i+1);
	return Math.max(arr[i] , maximum);
	}
}

/*

OUTPUT :

Enter a size of array : 5
Enter elements of array : 10 5 20 55 2
Maximum element in the array : 55

*/