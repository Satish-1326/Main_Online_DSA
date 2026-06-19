import java.util.*;
class Four_Sum{
	public static void main(String[]args){

	int [] arr = {1,0,-1,0,-2,2};
	int target = 0;
	
	List<List<Integer>> al = new ArrayList<>();

	for(int i = 0 ; i < arr.length-3; i++){
		int sum = 0;
		List<Integer> al1 = new ArrayList<>(); 
		for(int j = i +1 ; j < arr.length-2; j++){
			for(int k = j +1 ; k < arr.length-1; k++){
				for(int l = k + 1; l < arr.length; l++){
					sum += arr[i]+arr[j]+arr[k]+arr[l];
					if(sum == target){
						al1.add(arr[i]);
						al1.add(arr[j]);
						al1.add(arr[k]);
						al1.add(arr[l]);
						}
					}
				}
			}
		al.add(al1);
		}
	System.out.print(al);
	}
}

// Not getting output that i want