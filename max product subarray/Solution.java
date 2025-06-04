class Solution {
    public int maxProduct(int[] nums) {
      int max=nums[0];
      int min=nums[0];
      int globalMax=nums[0];
      for (int i =1;i<nums.length;i++){
        
        int tmp=max;
        max=Math.max(nums[i],Math.max(max*nums[i],min*nums[i]));
        min=Math.min(nums[i],Math.min(tmp*nums[i],min*nums[i]));

        globalMax=Math.max(max,globalMax);
      }

      return globalMax;  
    }
}