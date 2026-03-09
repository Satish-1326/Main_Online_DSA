class Demo{
	public static void main(String[]args){

	int n = 5 ;

	for(int i = n ; i >= 1 ; i--){
		for(int j = i ; j >= 1 ; j--){
			System.out.print("*"+" ");
			}
		System.out.println();
		}
	}
}

/*

OUTPUT :

* * * * *
* * * *
* * *
* *
*

TIME COMPLEXITY : O(n^2)
SPACE COMPLEXITY : O(1)

*/