import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter number to count all divisors : ");
	int n = sc.nextInt();
	int count = 0;
	
	for(int i = 1 ; i <= Math.sqrt(n) ; i++){
		if(n % i == 0){
			count++;
			if(i != n/i){
			count++;
				}
			}
		}
	System.out.print("Total count of all divisors : "+count);
	}
}

/*

OUTPUT :

Enter number to count all divisors : 12
Total count of all divisors : 6

*/