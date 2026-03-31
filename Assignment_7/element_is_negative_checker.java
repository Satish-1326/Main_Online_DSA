import java.util.*;
class Demo{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter size of array : ");
	int n = sc.nextInt();
	int [] arr = new int[n];

	System.out.print("Enter elements of array : ");
	for(int i = 0 ; i < arr.length ; i++){
		arr[i] = sc.nextInt();
	}
	
	boolean result = fun(arr,0);
	System.out.print("at least one negative exists : "+result);
	}

	public static boolean fun(int [] arr , int index){
		if(index == arr.length){
			return false;
		}

		if(arr[index] < 0){
			return true;
		}
	
	return fun(arr,index+1);
	}
}

/*

OUTPUT :

Enter size of array : 4
Enter elements of array : 1 2 -3 4
at least one negative exists : true

*/