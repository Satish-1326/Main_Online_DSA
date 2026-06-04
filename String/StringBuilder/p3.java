class Demo{
	public static void main(String[]args){

	StringBuilder sb = new StringBuilder("Hello");
	sb.append(" Java ");
	System.out.println(sb); // Hello Java
	sb.append(10);
	System.out.println(sb); // Hello Java 10
	sb.append(" "+true);
	System.out.println(sb); // Hello Java 10 true

	// StringBuilder la kahi jari dil mhanje integer , boolean values tari te tyala string madhe convert
	// krt aani jr append kel asel tr ne original string la attach krt.
	}
}