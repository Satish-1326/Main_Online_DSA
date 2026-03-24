import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number : ");
	int n = sc.nextInt();

	int count = 0;

	for(int i = 2 ; i <= n ; i++){
		int sum = 0 ;
		int temp = i;

		while(temp != 0){
			int digit = temp % 10;
			sum += digit;
			temp = temp / 10;
			}
		if(sum % 2 == 0){
			count ++;
			}
		}
	System.out.print("Total integer with even sum : "+count);
	}
}

/*

OUTPUT :

Enter a number : 30
Total integer with even sum : 14

*/