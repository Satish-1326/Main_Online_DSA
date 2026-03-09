import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a first number : ");
	int first_num = sc.nextInt();	

	System.out.print("Enter a second number : ");
	int second_num = sc.nextInt();

	int gcd = 0 ;

	while(first_num != 0 && second_num != 0){
		if(first_num > second_num){
			first_num = first_num % second_num;
			}
		else{
			second_num = second_num % first_num ;
			}
		}

	if(first_num == 0){
		gcd = second_num;
		}
	else{
		gcd = first_num;
		}
	
	System.out.print("Final gcd using Euclidean algorithm : "+gcd);
	}
}

/*

OUTPUT :

Enter a first number : 52
Enter a second number : 10
Final gcd using Euclidean algorithm : 2

*/