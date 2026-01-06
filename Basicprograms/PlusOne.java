import java.util.Arrays;
import java.util.Scanner;
class PlusOne{
    public int[] plusone(int[] digits){
        for( int i = digits.length-1; i>=0;i++){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int k = sc.nextInt();
        int[] arr = new int[k];
        System.out.println("Enter array elements");
        for( int i = 0;i < k; i++){
            arr[i] = sc.nextInt();
        }
        PlusOne obj = new PlusOne();
        int[] result = obj.plusone(arr);
        System.out.println("final array:" + Arrays.toString(result));
    }
}