package Basics;

public class p1 {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        Node head = convertArr2LL(arr);
        head = insertAtkLL(head,11 , 3);
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    // converting array to linked list
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

    // length of linked list
    private static int lenghtofLL(Node head){
        int cnt = 0;
        Node temp = head;
        while (temp != null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    // remove head of linked list
    private static Node removeHeadLL(Node head){
        if (head == null) return head;
        head = head.next;
        return head;
    }

    // remove tail of linked list
    private static Node removeTailLL(Node head){
        if (head == null || head.next == null) return null;
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    // delete Kth element of LL
    private static Node removeKelementLL(Node head , int k){
        if(head == null) return null;
        if(k == 1){
            head = head.next;
            return head;
        }
        int cnt = 0;
        Node temp = head;
        Node prev = null;
        while(temp != null){
            cnt++;
            if(cnt == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    // remove element of ll based on value
    private static Node removeElement(Node head , int val){
        if(head == null) return null;
        if(head.data == val){
            Node temp = head;
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null){
            if(temp.data == val){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    // Inserting problems start from here

    //insert at head postion
    private static Node insertHeadLL(Node head , int val){
        Node temp = new Node(val , head);
        return temp;
    }

    // insert new node at the tail
    private static Node insertAtTail(Node head , int val){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(val);
        return head;
    }

    // insert at Kth postion
    private static Node insertAtkLL(Node head , int val , int k){
        if(head == null) {
            if(k == 1) return new Node(val);
           else return null;
        }
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            if(count == k-1){
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    // search element in linkded list
    public static Boolean searchInLL(Node head , int val){
        boolean exist = false;
        Node temp = head;
        while (temp != null){
            if(temp.data == val){
                exist = true;
                break;
            }
            temp = temp.next;
        }
        return exist;
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
