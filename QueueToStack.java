import java.util.*;
class QueueToStack{
    List <Integer> q1 = new ArrayList<>();
    List <Integer> q2 = new ArrayList<>();
    public void push(int x){
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.remove(0));
        }
        List <Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    public int top(){
      return q1.get(0);
    }
    public int pop() {
        return q1.remove(0);
    }
    public boolean empty(){
        return q1.isEmpty();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        QueueToStack stk = new QueueToStack();
        System.out.println("Enter no.of Elements:");
        int n = sc.nextInt();
        System.out.println("Enter Elements:");
        for(int i =0; i < n; i++){
            int val = sc.nextInt();
            stk.push(val);
        }
        System.out.println("Top element:"  + stk.top());
        System.out.println("Pop element:" + stk.pop());
        System.out.println("top element After pop:" + stk.top());
        System.out.println("is Stack Empty: " + stk.empty());
    }
    }