import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a number : ");
	int n = sc.nextInt();
	int sum = 0;

	for(int i = 1 ; i <= n / 2 ; i++){
		if(n % i == 0){
			sum += i;
			}
		}
	if(n == sum){
		System.out.print("Perfect aahe...");
		}
	else{
		System.out.print("Perfect nahiye bala...");
		}
	}
}