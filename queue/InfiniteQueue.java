package queue;

import java.util.Scanner;

public class InfiniteQueue {

    private int front = 0;
    private int rear = -1;

    public void printQueue(Integer arr[]){
        int i = 0;
        System.out.println();
        while(arr[i]!=null){
            System.out.print("\t"+arr[i]);
            i++;
        }
        System.out.println();
    }
    public void Enqueue(Integer arr[] , int key) throws Exception{
        if(rear < arr.length){
            rear++;
            arr[rear] = key;
            System.out.println("element enqueued");
        }else{
            throw new Exception("no space present please dequeue some elements");
        }
    }
    public void Dequeue(Integer arr[]) throws Exception{
        if(front <= rear){
            System.out.println("element to be dequeued:- "+arr[0]);
            for(int i = 1 ; i < arr.length ; i++ ){
                arr[i-1] = arr[i];
            }
            rear --;
        }else{
            throw new Exception("no element present");
        }
    }
    public static void main(String[] args){
        Integer arr[] = new Integer[7];
        InfiniteQueue queue = new InfiniteQueue();
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
            System.out.println(e);
        }
    }
}
