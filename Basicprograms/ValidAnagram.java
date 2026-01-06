import java.util.*;
class ValidAnagram{
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] arr = new int[26];
        for(char c: s.toCharArray())
        {
            arr[c - 'a']++;
        }
        for(char c: t.toCharArray()){
            arr[c - 'a']--;
            if(arr[c - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String :");
        String s = sc.nextLine();
        System.out.println("Enter second String :");
        String t = sc.nextLine();
        ValidAnagram va = new ValidAnagram();
        boolean result = va.isAnagram(s , t);
        if(result){
            System.out.println("Strings are Anagrams");
        }
        else{
            System.out.println("Strings are NOT Anagrams");
        }
    }
}