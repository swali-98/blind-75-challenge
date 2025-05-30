class Solution {
    public int maxSubArray(int[] nums) {
      int max=nums[0];
      int value=nums[0];
      for(int i=1;i<nums.length;i++){
        if(value<0){
            if(nums[i]>=value){
                value=nums[i];
                max=Math.max(value,max);
                continue;
            }
        }
        else{
            value+=nums[i];
            max=Math.max(max,value);
        }

      }

      return max;
    }
}