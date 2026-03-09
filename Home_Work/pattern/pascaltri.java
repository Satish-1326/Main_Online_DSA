class Demo{
	public static void main(String[]args){

	int n = 5;

	for(int i = 0 ; i < n ; i++){
	int num = 1 ;
		for(int j = 1 ; j <= n - i ; j++){
			System.out.print("-");
			}
		for(int j = 0 ; j <= i ; j++){
			System.out.print(num+" ");
			num = num*(i-j);
			}
		System.out.println();
		}
	}
}

/*

OUTPUT :

-----1
----1 1
---1 2 2
--1 3 6 6
-1 4 12 24 24

BUGGY CODE NEED TO SOLVE

*/