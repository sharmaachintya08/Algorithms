//implementing queue using 2 stacks

package queue;

import java.util.Stack;

import java.util.Scanner;

public class ImplementationUsingStack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public ImplementationUsingStack(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public int Dequeue(){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int ans = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return ans;
    }
    public void Enqueue(int num){
        stack1.push(num);
    }
    public static void main(String[] args){
        ImplementationUsingStack queue = new ImplementationUsingStack();
        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Enqueue(30);
        System.out.println("Dequeued element :- "+queue.Dequeue());
        System.out.println("Dequeued element :- "+queue.Dequeue());
        queue.Enqueue(40);
        System.out.println("Dequeued element :- "+queue.Dequeue());
        System.out.println("Dequeued element :- "+queue.Dequeue());
    }
}
