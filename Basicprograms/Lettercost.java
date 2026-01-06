import java.util.*;
public class Lettercost{
    public static void main(String[] args){
        HashMap <Character, Integer> price = new HashMap<>();
        price.put('A', 10);
        price.put('B', 5);
        price.put('C', 3);
        String str = "ABAACAACB";
        int totalcost = 0;
        for (char ch: str.toCharArray()){
            totalcost += price.getOrDefault(ch, 0);
        }
        System.out.println("Total cost = " + totalcost);
    }
}