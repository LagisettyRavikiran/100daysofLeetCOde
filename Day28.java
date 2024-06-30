class Solution {
    public void sortColors(int[] nums) {
        int size = nums.length;
        for(int i=size-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(nums[j]>=nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(nums[i]+",");
        }
        
    }
}