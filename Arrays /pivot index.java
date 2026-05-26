class Solution {
    public int pivotIndex(int[] nums) {
        int tsum = 0 ;
        int leftsum = 0;
        for(int ele : nums){
            tsum += ele;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(leftsum == tsum - leftsum - nums[i])
            {
                return i;
            }
            else{
                leftsum += nums[i];
            }
        }
        return -1;
    }
}
