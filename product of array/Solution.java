class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int value=1;
        int[] prod=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            value*=nums[i];
           arr[i]=value;
        }

        int j =1;
        int k = arr.length-2;

        for(int i=nums.length-1;i>0;i--){
          
          prod[i]=arr[k]*j;
          j=j*nums[i];
          k--;
        }
        prod[0]=j;
        return prod;
    }
}