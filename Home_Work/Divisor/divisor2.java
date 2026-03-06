import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number to find divisors : ");
	int n = sc.nextInt();
	for(int i = 1 ; i <= Math.sqrt(n) ; i++){
		if(n % i == 0){
			System.out.println(i+" ");
		if(i != n / i){
			System.out.println(n/i +" ");
				}
			}
		}
	}
}

/*

OUTPUT :

Enter a number to find divisors : 36
1
36
2
18
3
12
4
9
6

problem solved for previous code 6 is not repeating anymore only unique divisors.

*/