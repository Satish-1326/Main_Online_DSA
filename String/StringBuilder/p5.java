class Demo{
	public static void main(String[]args){
	
	StringBuilder sb = new StringBuilder("Satish");
	sb.delete(1,3); // => 1 index = exclusive , 3 index inclusive
	System.out.println(sb); // Sish
	}
}