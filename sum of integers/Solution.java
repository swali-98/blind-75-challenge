class Solution {
    public int getSum(int a, int b) {
        int carry =(a&b)<<1;
       
        int sum=a^b;
        int total = sum ^ carry;

        System.out.println(total);

        while(carry!=0){
            carry=(sum&carry)<<1;
            sum=total;
            total^=carry;
            
        }

        return total;
    }
}