class Min_node{
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

	int min = Integer.MAX_VALUE;
	Node temp = head;
	while(temp != null){
		if(temp.data < min){
			min = temp.data;
			}
		temp = temp.next;
		}
	System.out.print("Minimum value node : "+min);
	}
}

class Node{
	int data;
	Node next;

	Node(int data){
		this.data = data;
	}
}

/*

OUTPUT :

Minimum value node : 10

*/