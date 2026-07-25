public class Leetcode_19_Remove_Nth_Node_From_End_of_List {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        Node head = convertArr2LL(arr);
        head =removeNthFromEnd(head , 2);
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    private static Node removeNthFromEnd(Node head , int k){
        int length = 0;
        Node temp = head;
        while (temp != null){
            length++;
            temp = temp.next;
        }
        if(length == k) return head.next;
        int target = length - k;

        temp = head;
        for (int i = 1; i < target; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    public static Node convertArr2LL(int [] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
}
// Linked List class
class Node{
    int data;
    Node next;

    Node(int data , Node next1){
        this.data = data;
        this.next = next1;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
