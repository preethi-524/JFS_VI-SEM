import java.util.*;
class MissingNumber{
    public int missingnumber(int[] nums){
        int n = nums.length;
        int total = n*(n + 1)/2;
        int sum = 0;
        for(int num: nums) {
            sum += num;
        }
        return total - sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[]  nums = new int[n];
        System.out.println("Enter array elements :");
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        MissingNumber mn = new MissingNumber();
        int result = mn.missingnumber(nums);
        System.out.println("Missing Number :" + result);
    }
}