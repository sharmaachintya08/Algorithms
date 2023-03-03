package queue;


class Node{
    public int data;
    public Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }
}
public class Queue {
    private Node rear;
    private Node front;

    public int dequeue() throws Exception{
        if(front == null){
            throw new Exception();
        }
        int data = front.data;
        front = front.next;
        return data;
    }
    public void enqueue(int data){
        Node newNode = new Node(data);
        if(front == null){
            rear = newNode;
            front = rear;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
    }
    public static void main(String[] args){
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.front != null ? queue.front.data : -1);
        System.out.println(queue.rear != null ? queue.rear.data : -1);
    }
}
