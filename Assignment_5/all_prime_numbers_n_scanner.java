import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number to find prime Numbers : ");
	int n = sc.nextInt();
	
	for(int i = 2 ; i <= n ; i++){
		int count = 0 ;
		for(int j = 1 ; j <= i ; j++){
			if(i % j == 0){
				count++;
				}
			}
		if(count == 2){
			System.out.print(i+" ");
			}
		}
	}
}

/*

OUTPUT :

Enter a number to find prime Numbers : 20
2 3 5 7 11 13 17 19

*/