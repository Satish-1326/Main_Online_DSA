public class Queue_using_Array {
    public static void main(String[] args){

        Satish satish = new Satish(5);

        satish.addElements(2);
        satish.addElements(3);
        satish.addElements(4);
        satish.addElements(5);
        satish.addElements(6);

        System.out.println("--------------");

        System.out.println("This is your peek element : "+satish.peek());

        System.out.println("-----------------------");

        System.out.println("This element is removed : "+satish.removeElement());

        System.out.println("--------------------------");

        System.out.print("All elements of Queue : ");
        satish.printQueue();
    }
}
class Satish{
    int [] arr;
    int front;
    int rear;
    int size;

    Satish(int size){
        arr = new int[size];
        front = 0;
        rear = -1;
        this.size = size;
    }

    void addElements(int val){
        if(rear == size - 1){
            System.out.println("Queue is already full bro....");
            return;
        }
        rear++;
        arr[rear] = val;
        System.out.println("Element added succesfully : "+val);
    }

    int removeElement(){
        if (front > rear){
            throw new RuntimeException("Queue is already empty");
        }
        int val = arr[front];
        front++;
        return val;
    }

    int peek(){
        if(front > rear){
            System.out.println();
        }
        return arr[front];
    }

    boolean isEmpty(){
        if(front > rear){
            return true;
        }
        return false;
    }

    void printQueue(){
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
