//stack implementation

package Algorithms.Stack;

public class Stack {
    private int arr[];
    private int top;

    public int peek() throws Exception{
        if(top == -1){
            throw new Exception("stack is empty");
        }
        return arr[top];
    }
    public int size(){
        if(top == -1){
            return 0;
        }else{
            return top + 1;
        }
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public int pop() throws Exception{
        if(top == -1){
            throw new Exception("stack is empty");
        }
        int res = arr[top];
        top --;
        return res;
    }
    public void push(int num) throws Exception{
        if(top == arr.length - 1){
            throw new Exception("stack is full");
        }
        top++;
        arr[top] = num;
    }
    public void createStack(int size){
        arr = new int[size];
        top = -1;
    }
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.createStack(11);
        try{
            stack.push(1);
        stack.push(5);
        stack.push(7);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
