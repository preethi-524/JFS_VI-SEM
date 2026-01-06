import java.util.*;
public class FrequencyExample{
    public static void main(String[] args){
        List<Integer> num_list = new ArrayList<>();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter data:");
            int data = sc.nextInt();
            num_list.add(data);
        }
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(Integer num: num_list) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Key set:" + freqMap.keySet());
        for(Integer k : freqMap.keySet()){
            System.out.println(k + "---->" +freqMap.get(k));
        }
    }
}