import java.util.HashMap;
import java.util.Scanner;
class LongestSubString {
    public int lengthoflongestsubstring(String s){
        HashMap < Character , Integer > map = new HashMap<>();
        int left = 0;
        int maxlength = 0;
        for(int right = 0; right < s.length(); right ++){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                left = Math.max(left, map.get(ch) + 1);
            }
            map.put(ch,right);
            maxlength = Math.max(maxlength, right - left + 1);
        }
        return maxlength;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        LongestSubString obj = new LongestSubString();
        int result = obj.lengthoflongestsubstring(s);
        System.out.println("Length of longest Substring without repeating characters:" + result);
    }
}