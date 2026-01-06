import java.util.*;
class ArrayListfrequency{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
            HashMap <Integer , Integer>frequency = new HashMap<>();
            for(int num : list){
                frequency.put(num, frequency.getOrDefault(num, 0) + 1);
                System.out.println("\nElement Frequency:");
                for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
}