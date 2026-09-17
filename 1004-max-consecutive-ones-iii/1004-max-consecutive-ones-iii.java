class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int l = 0;
        int zc = 0;
        for(int r = 0; r<nums.length; r++){
            if(nums[r]==0) zc++;
            while(zc > k){
                if(nums[l]==0) zc--;
                l++;
            }
            max = Math.max(max, r-l+1);
        }
        return max;
    }
}