class Sum_of_nodes{
	public static void main(String [] args){

	Node head = new Node(10);
	Node second = new Node(20);
	Node third = new Node(30);
	Node four = new Node(40);
	Node five = new Node(50);
	Node six = new Node(60);

	head.next = second;
	second.next = third;
	third.next = four;
	four.next = five;
	five.next = six;

	int sum = 0;
	Node temp = head;
	while(temp != null){
		sum = sum + temp.data;
		temp = temp.next;
		}
	System.out.print("Sum of elements of nodes : "+sum);
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

Sum of elements of nodes : 210

*/