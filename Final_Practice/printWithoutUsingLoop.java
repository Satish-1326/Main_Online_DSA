class Demo{
	public static void main(String [] args){

	Solution(1,1);
	}
	public static void Solution(int i , int count){
		
	if(count > 10){
		return;
		}
	
	count++;
	System.out.println(i);
	Solution(i, count);
	}
}