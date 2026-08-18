public class Implement_queue_using_array {
    public static void main(String[] args){
        MyQueue_2 myQueue_2 = new MyQueue_2(5);
    }
}
class MyQueue_2{
    int[] arr;
    int front;
    int rear;
    int size;

    public MyQueue_2(int size){
        arr = new int[size];
        front = 0;
        rear = -1;
        this.size = size;
    }

    // Add Elements
    void offer(int val){
        if(rear == size-1){
            System.out.println("Queue is already full...");
            return;
        }
        rear++;
        arr[rear] = val;
    }

    //Remove Elements;
    int poll(){
        if(front > rear){
            System.out.println("Queue is empty...");
            return -1;
        }
        int val = arr[front];
        front++;
        return val;
    }

    //Peek
    int peek(){
        if(front > rear){
            System.out.println("Queue is empty...");
            return -1;
        }
        return arr[front];
    }

    //Checking the queue is empty or not
    boolean isEmpty(){
        if(front > rear){
            return true;
        }
        return false;
    }
}
