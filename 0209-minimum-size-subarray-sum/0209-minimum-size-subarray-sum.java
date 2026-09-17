class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for(int r = 0; r < nums.length; r++) {

            sum += nums[r];

            while(sum >= target) {

                int l = r - left + 1;

                minLength = Math.min(minLength, l);

                sum -= nums[left];

                left++;
            }
        }

        if(minLength == Integer.MAX_VALUE) {
            return 0;
        }

        return minLength;
    }
}