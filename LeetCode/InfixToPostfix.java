package LeetCode;
//problem in my code recheck


import java.util.Stack;

//conversion of infix expression to postfix


public class InfixToPostfix {
    public boolean precedence(char expChar , char stackChar){
        //precedence of expChar should be larger to return true
        if((expChar == '/' && stackChar == '*') || (expChar == '/' && stackChar == '+') || (expChar == '/' && stackChar == '-') || (expChar == '/' && stackChar == '/')){
            return true;
        }
        if((expChar == '*' && stackChar == '+') || (expChar == '*' && stackChar == '-') || (expChar == '*' && stackChar == '*')){
            return true;
        }
        if((expChar == '+' && stackChar == '-') || (expChar == '+' && stackChar == '+')){
            return true;
        }
        return false;
    }
    public boolean isOperator(char expChar){
        if(expChar == '*' || expChar == '/' || expChar == '^' || expChar == '%' || expChar == '+' || expChar == '-' || expChar == '(' || expChar == ')'){
            return true;
        }
        return false;
    }
    public String convertToPostfix(String exp){
        Stack<Character> stack = new Stack();
        String postfixExpr="";
        int i = 0 ;
        while( i < exp.length() ){
            char expChar = exp.charAt(i);
            if(isOperator(expChar)){
                if(expChar == '('){
                    stack.push(expChar);
                    i++;
                }else{
                    if(stack.isEmpty()){
                        if(expChar == ')'){
                            i++;
                        }else{
                            stack.push(expChar);
                            i++;
                        }
                    }else{
                        if(expChar == ')'){
                            if(stack.peek() == '('){
                                stack.pop();
                                break;
                            }else{
                                postfixExpr += stack.peek();
                                stack.pop();
                            }
                        }else{
                            if(precedence(expChar,stack.peek())){
                                stack.push(expChar);
                                i++;
                            }else{
                                postfixExpr += stack.peek();
                                stack.pop();
                            }
                        }
                    }
                }
            }else{
                postfixExpr+= expChar;
                i++;
            }
        }
        return postfixExpr;
    }
    public static void main(String[] args){
        String exp = "A+B*C+D";
        InfixToPostfix itp = new InfixToPostfix();
        String postfix = itp.convertToPostfix(exp);
        System.out.println("infix expr :- "+exp+" postfix expr :- "+postfix);
    }
}
