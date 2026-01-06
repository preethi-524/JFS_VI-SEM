import java.util.Arrays;
class PlusoneArray {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1 ; i>=0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }
public static void main(String[]args){
  PlusoneArray obj = new PlusoneArray();
  int[] arr = { 1, 2, 4};
  int[] result = obj.plusOne(arr);
  System.out.println(Arrays.toString(result));
}
}