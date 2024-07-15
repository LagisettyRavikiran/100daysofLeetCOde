class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int rsum = 0;
        for(int ele:nums){
            rsum += ele;
        }
        int lsum = 0;
        for(int i=0;i<n;i++){
            rsum -= nums[i];
            if(rsum == lsum){
                return i;
            }
            lsum += nums[i];
        }
        return -1;
    }
}