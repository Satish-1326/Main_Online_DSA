import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number : ");
	int n = sc.nextInt();
	int min = Integer.MAX_VALUE;
	for(int i = 1 ; i <= min; i++){
		if(i % n == 0 && i % 2 == 0){
			if(i < min){
				min = i;
				}
			}
		}
	System.out.print("Minimum Even multiple of both numbers : "+min);
	}
}

/*

OUTPUT :

Enter a number : 5
Minimum Even multiple of both numbers : 10

*/