class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Map<Integer,Integer> hash=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(target-nums[i])){
                arr[0]=hash.get(target-nums[i]);
                arr[1]=i;
                return arr;
            }

            hash.put(nums[i],i);
        }

        return arr;
        
    }
}