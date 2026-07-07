class Count_even_node{
	public static void main(String[]args){
		
	Node head = new Node(1);
	Node sec = new Node(2);
	Node third = new Node(3);
	Node four = new Node(4);
	Node five = new Node(5);
	Node six = new Node(6);

	head.next = sec;
	sec.next = third;
	third.next = four;
	four.next = five;
	five.next = six;

	int even_count = 0;
	Node temp = head;
	while(temp != null){
		if(temp.data % 2 == 0){
			even_count++;
			}
	temp = temp.next;
		}
	System.out.print("Total even nodes : "+even_count);
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

Total even nodes : 3

*/