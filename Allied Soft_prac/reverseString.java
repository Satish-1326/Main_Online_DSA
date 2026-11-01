class Demo{
	public static void main(String[]args){

	String s = "satish";
	String rev = "";

	for(int i = s.length()-1; i >= 0; i--){
		rev += s.charAt(i);
		}
	System.out.print(rev);
	}
}