import java.util.HashMap;
import java.util.Scanner;
class RomantoInteger{
    public int romanToInt(String s){
        HashMap <Character, Integer>map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[]chars = s.toCharArray();
        int i = 0;
        int result = 0;
        for( int j = 1; j < chars.length; j++)
        {
          if (map.get(chars[i]) >=  map.get(chars[j]))
            {
            result += map.get(chars[i]);
          }
          else{
            result-= map.get(chars[i]);
          }
          i++;
        }
        result += map.get(chars[i]); 
        return result;
    }
    public static void main (String[] args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter Roman value: ");
        String s = sc.nextLine();
        RomantoInteger obj = new RomantoInteger();
        int ans = obj.romanToInt(s);
        System.out.println("Interger is " + ans);
    }
}