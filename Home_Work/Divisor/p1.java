import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number to get all perfect devisors : ");
	int n = sc.nextInt();

	for(int i = 1 ; i <= Math.sqrt(n) ; i++){
		if(n % i == 0){
			System.out.println(i+" ");
			System.out.println(n / i+" ");
			}
		}
	}
}

/*

OUTPUT :

Enter a number to get all perfect devisors : 66
1 66
2 33
3 22
6 11

Problem :
jevha aapan input 36 ghetoy tevha 6 double print hotay te aaplyala nako aahe.

*/