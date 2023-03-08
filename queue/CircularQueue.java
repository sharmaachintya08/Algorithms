//problem in the code

package queue;

import java.util.Scanner;


public class CircularQueue {
    private int front = -1;
    private int rear = -1;
    public void printQueue(Integer arr[]) throws Exception{
        if( rear == -1 && front == -1){
            throw new Exception("cannot print queue is empty");
        }
        int n = arr.length;
        int i = front;
        System.out.println();
        while(i <= rear){
            System.out.print("\t"+arr[i]);
            i = (i + 1)%n;
        }
        System.out.println();
    }
    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    public boolean isFull(){
        return rear == front - 1;
    }
    public void Dequeue(Integer arr[]) throws Exception{
        int n = arr.length;
        if(isEmpty()){
            throw new Exception("queue is empty cannot dequeue another element");
        }else{
            if(front == rear){
                front = -1;
                rear = -1;
            }
            arr[front] = null;
            front = (front + 1)%n;
        }
    }
    public void Enqueue(Integer arr[] , int key) throws Exception{
        int n = arr.length;
        if(isFull()){
            throw new Exception("queue is full cannot insert new elements");
        }else{
            if(rear == -1){
                front = (front + 1)%n;
            }
            rear = (rear + 1 )%n;
            arr[rear] = key;
        }
    }
    public static void main(String[] args){
        Integer arr[] = new Integer[3];
        CircularQueue queue = new CircularQueue();
        Scanner sc  = new Scanner(System.in);
        try{
            while(true){
                System.out.println("type the operation :- enqueue,dequeue,print");
                switch(sc.nextLine()){
                    case "enqueue" : 
                        System.out.println("type number to enqueue");
                        int num = sc.nextInt();
                        queue.Enqueue(arr, num);
                        break;
                    case "dequeue" : 
                        queue.Dequeue(arr);
                        break;
                    case "print" : 
                        queue.printQueue(arr);
                        break;
                    default : 
                        break;
                }
            }
        }catch(Exception e){
    }
    }
}
