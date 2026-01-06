import java.util.Arrays;
import java.util.Scanner;
class RemoveDuplicates{
    public int removeduplicates(int[]nums){
        int i = 0;
        for(int j = 1; j < nums.length; j++){
           if(nums[i] != nums[j])
            {
                i++;
                nums[i] = nums[j];
            } 
        }
        return i + 1;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter elements in array: ");
        for( int  i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        RemoveDuplicates obj = new RemoveDuplicates();
        int k = obj.removeduplicates(arr);
        int[] finalArr = Arrays.copyOf(arr, k);
        System.out.println(Arrays.toString(finalArr));
    }
}