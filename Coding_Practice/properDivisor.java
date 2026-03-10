import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a  number to find proper divisors : ");
	int n = sc.nextInt();

	for(int i = 1 ; i <= n / 2 ; i++){
		if(n % i == 0){
			System.out.print(i +" ");
			}
		}
	}
}

/*

OUTPUT :

Enter a  number to find proper divisors : 12
1 2 3 4 6

*/