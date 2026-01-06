
class FibonacciBelow100{
    public static void main(String[]args){
         int a = 0 ; 
         int b = 1;
        System.out.print("Fibonacci series Below 100: ");
        while(a < 100) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c; 
        }
    }
}