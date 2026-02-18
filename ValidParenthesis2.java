import java.util.Scanner;
import java.util.Stack;
class ValidParenthesis2{
    public boolean isValid(String s)
    {
        Stack<Character> stack= new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '[') {
               stack.push(c); 
            }
            else{
                if(stack.isEmpty())return false;
                char top = stack.pop();
                if((c == ')' && top != '(') ||
                (c == '{' && top != '}') ||
                (c == '[' && top != ']')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        ValidParenthesis obj = new ValidParenthesis();
        boolean res = obj.isValid(s);
        System.out.println("Given String is :" + res);
    }
}