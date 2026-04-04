import java.util.*;
class Demo{
	public static void main(String[]args){

	int [] arr = {1,2,2,3,3,3,4,4};
	int max = 0;
	int s_max = 0;

	for(int i = 0 ; i < arr.length ; i++){
		int count = 0;
		for(int j = 0 ; j < arr.length ; j++){
			if(arr[i] == arr[j]){
				count++;
				}
			}
		if(count > max){
			max = arr[i];
			}
		}
	//System.out.print(max);

	for(int i = 0 ; i < arr.length ; i++){
		int count = 0;
		for(int j = 0 ; j < arr.length ; j++){
			if(arr[i] == arr[j]){
				count++;
				}
			}
		if(count > s_max && max != arr[i]){
			s_max = arr[i];
			}
		}
	System.out.println("maximum frequency : "+max);
	System.out.println("second maximum frequency : "+s_max);
	}
}

/*

OUTPUT :

maximum frequency : 3
second maximum frequency : 2

*/


class second_freq_using_freq_array{
	public static void main(String[]args){
		int [] arr = {1,2,2,3,3,3,4,4};
		int max = 0 ;
		int max_freq = 0;
		int s_max_freq = 0;
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}

		int [] freq = new int[max+1];

		for(int i = 0 ; i < arr.length ; i++){
			freq[arr[i]]++;
		}
		for (int i = 0; i < freq.length; i++) {
//			System.out.println(i + " : " + freq[i]);
			if(freq [i] > max_freq && freq[i] > 0){
				max_freq = i;
			}
		}
		System.out.println("maximum frequency  : "+max_freq);
		for (int i = 0; i < freq.length; i++) {
//			System.out.println(i + " : " + freq[i]);
			if(freq [i] > s_max_freq && freq[i] > 0 && i != max_freq){
				s_max_freq = i;
			}
		}
		System.out.println("second maximum frequency : "+s_max_freq);
	}
}

/*
OUTPUT :
maximum frequency  : 3
second maximum frequency : 2
 */


class Second_freq_using_hash{
	public static void main(String[]args){
		int [] arr = {1,2,2,3,3,3,4,4};

		int max = 0;
		int s_max = 0;

		HashMap<Integer , Integer> hm = new HashMap<>();

		for(int i = 0 ; i < arr.length ; i++){
			hm.put(arr[i] , hm.getOrDefault(arr[i] , 0 )+1);
		}
		for (int key : hm.keySet()){
			if(hm.get(key) > max){
				max = key;
			}
		}
		for (int key : hm.keySet()){
			if (hm.get(key) > s_max && key != max){
				s_max = key;
			}
		}
		System.out.println("maximum frequency : "+max);
		System.out.println("second maximum frequency : "+s_max);
 	}
}

/*
OUTPUT :
maximum frequency : 3
second maximum frequency : 2
 */