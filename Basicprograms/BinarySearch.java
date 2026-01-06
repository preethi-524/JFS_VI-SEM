import java.util.*;
class BinarySearch{
    public int search(int[]nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right)/2;
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] < target)
        {
            left = mid + 1;
        }
        else{
            right = mid - 1;
        }
    }
    return -1;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array size:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter sorted array Elements :");
        for( int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter target Element: ");
        int target = sc.nextInt();
        BinarySearch bs = new BinarySearch();
        int result = bs.search(nums , target);
        if(result != -1)
        {
            System.out.println("Element found at:" + result);
        }
        else{
            System.out.println("Element NOT found");
        }

    }
}