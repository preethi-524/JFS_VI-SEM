class PositionofElement {
    public int[] searchRange(int[] nums, int target) {
        int left = firstLeft(nums, target);
        int right = firstRight(nums, target);
        return new int[]{left, right};   
    }

    public int firstLeft(int[]nums, int target){
        int L = 0;
        int R = nums.length - 1;
        int pos = -1;
        while(L <= R){
            int mid = (L + R)/2;
            if(nums[mid] == target){
                pos = mid;
                R = mid - 1;
            }
            else if(nums[mid] <= target){
              L = mid + 1;  
            }
            else{
                R = mid - 1;
            }
        }
        return pos;

    }

    public int firstRight(int[] nums, int target){
        int L = 0;
        int R = nums.length - 1;
        int pos = -1;
        while(L <= R){
            int mid = (L + R)/2;
            if(nums[mid] == target){
                pos = mid;
                L = mid + 1;
            }
            else if(nums[mid] <= target){
              L = mid + 1;  
            }
            else{
                R = mid - 1;
            }
        }
        return pos;
    }
    public static void main(String[] args) {
        PositionofElement obj = new PositionofElement();

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] ans = obj.searchRange(nums, target);

        System.out.println(ans[0] + " " + ans[1]);
    }
}