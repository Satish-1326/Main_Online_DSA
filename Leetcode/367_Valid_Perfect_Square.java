import java.util.*;
class Demo5{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number : ");
	int n = sc.nextInt();

	int sqrt = (int)Math.sqrt(n);

	if((sqrt*sqrt) == n){
		System.out.print("This number have valid perfect square");
		}
	else{
		System.out.print("This number dont have valid perfect square");
		}
	}
}

/*

OUTPUT 1 :

Enter a number : 16
This number have valid perfect square

OUTPUT 2 :

Enter a number : 14
This number dont have valid perfect square


*/