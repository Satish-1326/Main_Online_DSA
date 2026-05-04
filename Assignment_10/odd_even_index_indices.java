import java.util.*;
class Odd_even_index{
	public static void main(String[]args){

	int [] arr = {10, 20, 30, 40, 50};

	System.out.print("Elements at even indices : ");
	for(int i = 0 ; i < arr.length ; i++){
		if(i % 2 == 0){
			System.out.print(arr[i]+" ");
			}
		}
	System.out.println();
	System.out.print("Elements at odd indices : ");
	for(int i = 0 ; i < arr.length ; i++){
		if(i % 2 != 0){
			System.out.print(arr[i] +" ");
			}
		}
	}
}

/*

OUTPUT :

Elements at even indices : 10 30 50
Elements at odd indices : 20 40

*/

class odd_even_indices_freq{
	public static void main(String[]args){
	int [] arr = {10, 20, 30, 40, 50};
	
	HashMap <Integer , Integer>hm = new HashMap<>();

	for(int i = 0 ; i < arr.length ; i++){
		hm.put(arr[i] , i);
		}

	System.out.print(hm);
	}
}