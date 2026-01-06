import java.util.Scanner;
class Lengthoflastword{
    public int lengthoflastword(String s){
        String[] str = s.split("\\s+");
        return str[str.length - 1].length();
    }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a sentence :");
      String s = sc.nextLine();
      Lengthoflastword obj = new Lengthoflastword();
      int result = obj.lengthoflastword(s);
      System.out.println("Length of last word :" + result);
    }
}