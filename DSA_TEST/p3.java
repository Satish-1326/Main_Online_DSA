import java.util.*;
class Frequency_of_Each_Element {
	public static void main(String[]args){
	
	int [] arr = {1,2,2,3,3,3,4};
	
	int max = 0;
	for(int i = 0 ; i < arr.length ; i++){
		if(arr[i] > max){
			max = arr[i];
			}
		}
	int [] result = new int[max+1];

	for(int i = 0 ; i < arr.length ; i++){
		result[arr[i]]++;
		}

	for(int i = 0 ; i < result.length ; i++){
		if(result[i] != 0){
			System.out.println(i +" => "+result[i]);
			}
		}
	}
}

class Frequency_of_Each_Element_app_2{
	public static void main(String[]args){
	
	int [] arr = {1,2,2,3,3,3,4};
	HashMap<Integer , Integer> hm = new HashMap<>();

	for(int i = 0 ; i < arr.length ; i++){
		hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
		}

	for(int key : hm.keySet()){
		System.out.println(key + " : "+hm.get(key));
		}
	}
}

/*

OUTPUT :

1 => 1
2 => 2
3 => 3
4 => 1

*/