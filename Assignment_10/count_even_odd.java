import java.util.*;
class Count_even_odd{
	public static void main(String[]args){

	int [] arr = {1, 2, 3, 4, 5, 6};
	int even = 0;
	int odd = 0;

	for(int i = 0 ; i < arr.length ; i++){
		if(arr[i] % 2 == 0){
			even++;
			}
		if(arr[i] % 2 != 0){
			odd++;
			}
		}
	System.out.print("Even count : "+even);
	System.out.println();
	System.out.print("Odd count : "+odd);
	}
}

/*

OUTPUT :

Even count : 3
Odd count : 3

*/

class odd_and_even_hash{
	public static void main(String [] args){
		
	int [] arr = {1,2,3,4,5,6};
	
	int even = 0;
	int odd = 0;

	HashMap<Integer , Integer>hm = new HashMap<>();

	for(int i = 0 ; i < arr.length ; i++){
		hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
		}

	for(int key : hm.keySet()){
		if(key % 2 == 0){
			even++;
			}
		if(key % 2 != 0){
			odd++;
			}
		}
	System.out.print("Even count : "+even);
	System.out.println();
	System.out.print("Odd count : "+odd);
	}
}

/*

OUTPUT :

Even count : 3
Odd count : 3

*/


