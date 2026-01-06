import java.util.Scanner;
class PeakElement{
    public int findpeakelement(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while(left < right){
             mid = (left + right) / 2;
        if(nums[mid] < nums[mid+1]){
            left = mid + 1;
        }
            else{
                right = mid;
            }
        }
            return left;       
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }
        PeakElement obj = new PeakElement();
        int PeakIndex = obj.findpeakelement(arr);
        System.out.println("Peak Index is:" + PeakIndex);
    }
}