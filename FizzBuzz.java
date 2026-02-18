import java.util.*;
class FizzBuzz {
    public List <String> fizz(int n){
        List <String> res = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0) res.add("FizzBuzz");
            else if (i % 3 == 0) res.add("Fizz");
            else if (i % 5 == 0) res.add("Buzz");
            else res.add(String.valueOf(i));
        }
        return res;   
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value:");
        int n = sc.nextInt();
        FizzBuzz obj = new FizzBuzz();
        List <String> result = obj.fizz(n);
        System.out.println("Result:" + result);
    }
}