class Search_k_value_node{
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

	boolean found = false;
	int k = 20;
	Node temp = head;
	while(temp != null){
		if(temp.data == k){
			found = true;
			break;
			}
		temp = temp.next;
		}
	System.out.print("Value of k exist ? : "+found);
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

Value of k exist ? : true

*/