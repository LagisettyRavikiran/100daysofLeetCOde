class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = (len*(len+1))/2;
        int c =0;
        for(int i=0;i<len;i++){
            c+=nums[i];
        }
        int ans = sum - c;
        return ans;
    }
}