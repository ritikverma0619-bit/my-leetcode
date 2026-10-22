class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int firstStp = 1;
        int secondStp = 2;
        for(int i = 3; i<=n; i++){
            int thirdStp = firstStp + secondStp;
            firstStp = secondStp;
            secondStp = thirdStp;
        }
        return secondStp;
    }
}