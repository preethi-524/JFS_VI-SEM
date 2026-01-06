import java.util.Scanner;
class MultiplyofStrings{
    public String multiply(String num1 , String num2){
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n];
        for(int i = m - 1; i>=0 ; i--){
            for(int j = n-1; j>=0; j--){
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + result [i + j + 1];
                result [i + j + 1] = sum % 10;
                result [i + j] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int num : result){
            if(!(sb.length() == 0 && num == 0)){
                sb.append(num); 
            }
        }
        return sb.toString();

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        String num1 = sc.nextLine();
        System.out.println("Enter second number:");
        String num2 = sc.nextLine();
        MultiplyofStrings obj = new MultiplyofStrings();
        String result = obj.multiply(num1 , num2);
        System.out.println("Multiplication of 2 numbers:" + result);

    }
}