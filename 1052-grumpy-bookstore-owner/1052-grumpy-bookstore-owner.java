class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int s = 0;
        for(int i=0; i<customers.length; i++){
            if(grumpy[i]==0){
                s += customers[i];
            }
        }
        int us = 0; int maxus = 0;
        for(int i=0; i<minutes; i++){
            if(grumpy[i]==1){
                us += customers[i];
            }
        }
        maxus =us;
        for(int i=minutes; i<customers.length; i++){
            if(grumpy[i-minutes]==1){
                us -= customers[i-minutes];
            }
            if(grumpy[i]==1){
                us += customers[i];
            }
            maxus = Math.max(us, maxus);
        }
        return s+maxus;
    }
}