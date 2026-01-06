import java.util.Arrays;
import java.util.Scanner;
class RemoveElement{
    public int removeelement(int[]nums, int val){
        int i =0;
        for( int j = 0; j < nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements");
        for( int i=0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter value to remove:");
        int val = sc.nextInt();
        RemoveElement obj = new RemoveElement();
        int k = obj.removeelement(nums, val);
        int[] finalArr = Arrays.copyOf(nums, k);
        System.out.println("Final array:"+ Arrays.toString(finalArr));
        System.out.println("New length:" + k);
        sc.close();
    }
}