//Parenthesis matching problem



import java.util.Stack;

public class ParenthesisChecker {
    public char removeParen(char i){
        if(i == ']'){
            return '[';
        }else if(i == '}'){
            return '{';
        }else{
            return '(';
        }
    }
    public boolean openParen(char i){
        if(i == '{' || i == '[' || i == '('){
            return true;
        }
        return false;
    }
    public boolean ifMatch(String paren){
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < paren.length() ; i++ ){
            if(openParen(paren.charAt(i))){
                stack.push(paren.charAt(i));
            }else{
                if(!stack.peek().equals(removeParen(paren.charAt(i)))){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        return stack.empty();
    }
    public static void main(String[] args){
        ParenthesisChecker pc = new ParenthesisChecker();
        String paren = "(({}))";
        System.out.println("check if stack matches or not:- "+ pc.ifMatch(paren));
    }
}
