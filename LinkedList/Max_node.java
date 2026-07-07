class Max_node{
	public static void main(String[]args){

	Node head = new Node(10);
	Node sec = new Node(20);
	Node third = new Node(30);
	Node four = new Node(40);
	Node five = new Node(50);
	Node six = new Node(60);

	head.next = sec;
	sec.next = third;
	third.next = four;
	four.next = five;
	five.next = six;

	int max = Integer.MIN_VALUE;
	Node temp = head;
	while(temp != null){
		if(temp.data > max){
			max = temp.data;
			}
	temp = temp.next;
		}
	System.out.print(max);
	}
}

class Node{
	int data;
	Node next;

	Node(int data){
		this.data = data;
	}
}