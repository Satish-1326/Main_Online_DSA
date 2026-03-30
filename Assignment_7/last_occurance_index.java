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

	System.out.print("Enter a target element : ");
	int target = sc.nextInt();
	int result = fun(arr,0,target);

	System.out.print("Last occurance of a target element : "+result);
	}

	static int fun(int [] arr , int index , int target){
		if(index == arr.length - 1){
			return -1;
		}

	int result = fun(arr,index+1,target);

	if(result != -1){
		return result;
		}
	if(target == arr[index]){
		return index;
		}
	return -1;
	}
}

/*

OUTPUT :

Enter size of array : 5
Enter elements of array : 3 7 4 3 8
Enter a target element : 3
Last occurance of a target element : 3

*/