import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter size of array : ");
	int n = sc.nextInt();

	int [] arr = new int[n];

	System.out.print("Enter elements of array : ");

	for(int i = 0 ; i < arr.length ; i++){
		arr[i] = sc.nextInt();
	}


	System.out.print("Enter target element : ");	
	int target = sc.nextInt();
	int result = fun(arr,0,target);

	System.out.print("Index of First occurance : "+result);
	}

	static int fun(int [] arr , int index , int target){
		if(index == arr.length-1){
			return -1;
		}

	if(target == arr[index]){
		return index;
		}

	return fun(arr,index+1,target);
	}
}

/*

OUTPUT  :

Enter size of array : 6
Enter elements of array : 4 5 2 4 7 9
Enter target element : 7
Index of First occurance : 4

*/