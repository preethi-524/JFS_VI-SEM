import  java.util.Scanner;
import java.util.Stack;
class ValidParenthesis{
    public boolean isvalid(String s){
        Stack <Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch == '(' || ch == '{' || ch =='[')
                stack.push(ch);
            else {
                if(stack.isEmpty())
                    return false;
                char top = stack.pop();
                    if((ch == ')' && top != '(')||
                    (ch == '}' && top != '{')||
                    (ch == ']' && top != '['))
                {
                    return false;
                }
            }        
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String parenthesis :");
        String s = sc.nextLine();
        ValidParenthesis vp = new ValidParenthesis();
        boolean result = vp.isvalid(s);
        if(result)
        {
            System.out.println("Valid Parenthesis");
        }
        else{
            System.out.println("Invalid Parenthesis");
        }
       sc.close();
    }
}