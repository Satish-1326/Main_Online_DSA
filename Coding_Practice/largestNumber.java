import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a Number to Find the largest divisor except the number : ");
	int n = sc.nextInt();

	int large = 0;

	for(int i = 1 ; i <= n ; i++){
		if(n % i == 0){
			if(i != n){
				large = i;
				}
			}
		}
	System.out.print("largest divisor except the number : "+large);
	}
}

/*

OUTPUT :

Enter a Number to Find the largest divisor except the number : 12
largest divisor except the number : 6

*/