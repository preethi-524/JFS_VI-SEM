import java.util.Arrays;
class MoveZeroes_2{
    public void moveZeroes(int[]nums){
        int i=0;
        for(int j = 0 ; j < nums.length; j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        }
        while( i < nums.length){
            nums[i] = 0;
            i++;
        }
    }
    public void main(String[]args){
        MoveZeroes_2 obj = new MoveZeroes_2();
        int[]nums = {0 , 1, 0, 3, 12};
        obj.MoveZeroes_2(nums);
        System.out.println(Array.toString());
    }
}