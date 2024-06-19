class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxx = nums[0];
        int currmax = nums[0];
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i]){
                currmax += nums[i];
            }
            else{
                maxx = Math.max(maxx,currmax);
                currmax = nums[i];
            }
        }
        maxx = Math.max(maxx,currmax);
        return maxx;
    }
}