import java.util.*;
class Demo{
	public static void main(String[]args){
	
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number to check it is prime or not : ");
	int a = sc.nextInt();

	int count = 0;

	for(int i = 1 ; i <= a ; i++){
		if(a % i == 0){
			count++;
			}
		}
	
	if(count == 2){
		System.out.print("perfect ahhe re bhava........");
		}
	else{
		System.out.print("Perfect nahiye , sorry bala.........");
		}
	}
}