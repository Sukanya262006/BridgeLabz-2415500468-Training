import java.util.Stack;
public class Bracketclosing {
    public static boolean isPairedUp(String str){
        Stack<Character> stack = new Stack();
        for(char c:str.toCharArray()){
            if(c=='{'||c=='['||c=='('){
                stack.push(c);
            }
            else if(c=='}'||c==']'||c==')'){
                if(stack.isEmpty()){
                    return false;
                }
                if((stack.peek() != '(' && c==')')||(stack.peek() != '{' && c=='}')||(stack.peek() != '[' && c==']')){
                    return false;
                }
                stack.pop();
            }

        }
        return stack.isEmpty();

    }



    public static void main(String[] args) {
        String str = "(){}[]";
        System.out.println(isPairedUp(str));
    }
}