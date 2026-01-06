import java.util.HashMap;
class TwoSumPrblm{
    public int[] twoSum (int[]nums,  int target){
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i], i);
        }
      return new int[]{};
    }
    public static void main(String[] args)
    {
       TwoSumPrblm obj = new TwoSumPrblm();
       int[] complement = obj.twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(complement[0] + " " + complement[1]);
    }
}


