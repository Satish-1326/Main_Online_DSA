class Demo{
    public static void main(String[] args){
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

        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

// 10 20 30 40 50 60
