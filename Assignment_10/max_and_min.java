import java.util.*;
class max_and_min{
	public static void main(String [] args){

	int [] arr = {5, 8, 2, 10, 3};
	int max = 0;
	int min = Integer.MAX_VALUE;

	for(int i = 0 ; i < arr.length ; i++){
		if(arr[i] > max){
			max = arr[i];
			}
		}
	for(int i = 0 ; i < arr.length ; i++){
		if(arr[i] < min){
			min = arr[i];
		}
	}

	System.out.print("Maximum : "+max);
	System.out.println();
	System.out.print("Minimum : "+min);
	}
}

/*

OUTPUT :

Maximum : 10
Minimum : 2

*/



class using_hash_max_and_min{
	public static void main(String [] args){
		
	int [] arr = {5, 8, 2, 10, 3};
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;

	HashMap<Integer , Integer>hm = new HashMap<>();

	for(int i = 0 ; i < arr.length ; i++){
		hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
		}

	for(int key : hm.keySet()){
		if(key > max){
			max = key;
			}
		}

	for(int key : hm.keySet()){
		if(key < min){
			min = key;
		}
	}


	System.out.print("Maximum using hashmap : "+max);
	System.out.println();
	System.out.print("Minimum using hashmap : "+min);

	}
}

/*

OUTPUT :

Maximum using hashmap : 10
Minimum using hashmap : 2

*/


