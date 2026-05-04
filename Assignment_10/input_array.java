import java.util.*;
class Input_array{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of array : ");
	int n = sc.nextInt();

	int [] arr = new int[n];

	System.out.print("Enter The element of array : ");
	for(int i = 0 ; i < n ; i++){
		arr[i] = sc.nextInt();
		}

	for(int i = 0 ; i < n ; i++){
		System.out.print(arr[i]+" ");
		}
	}
}

/*

OUTPUT :

Enter the size of array : 4
Enter The element of array : 1 2 3 4
1 2 3 4

*/
