import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number : ");
	int n = sc.nextInt();;
	int square = (n*n) ;

	if(square % 100 == n){
		System.out.print("aahe re........");
		}
	else{
		System.out.print("nahi ree.........");
		}
	}
}