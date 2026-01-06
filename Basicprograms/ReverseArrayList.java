import java.util.*;
public class ReverseArrayList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            list.add(n);
        }
        Collections.reverse(list);
        System.out.println("Reversed elements:" + list);

    }
}