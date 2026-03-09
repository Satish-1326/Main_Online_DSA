import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter number to check : ");
	int n = sc.nextInt();
	
	int sum = 0;
	
	for(int i = 1 ; i<= n/2 ; i++){
		if(n % i == 0){
			sum += i;
		}
	}

	if(sum == n){
		System.out.print("Perfect Number");
		}
	else{
		System.out.print("Not Perfect Number");
		}
	}
}

/*

OUTPUT :

Enter number to check : 6
Perfect Number

*/