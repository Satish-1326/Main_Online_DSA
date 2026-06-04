class Demo{
	public static void main(String[]args){

	StringBuilder sb = new StringBuilder(); // Empty Builder
	StringBuilder sb1 = new StringBuilder("hello"); // Initial value
	StringBuilder sb2 = new StringBuilder(100+"5"); // jya veles aapan ass lihitoy tevha "1005" ass 	//statement create hot aahe mhanje aata jya veles sb2 ha StringBuilder create honar tevha tyachi 	//initial length aste 16 aani "1005" hya string chi length 4 he milun honar 16+4 = 20 
	System.out.println(sb2.capacity()); // 20
	}
}