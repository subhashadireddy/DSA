class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int sum=0;
       int count =0;
       for(int i : nums){
        if(i==1){
            sum+=1;
        }
        else{
            sum=0;
        }
        count = Math.max(sum,count);
       } 
       return count;
    }
}
