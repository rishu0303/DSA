class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int miny = 100000000;
        int n = nums.length-1;
        int j =0;
        for(int i =0;i<=n;i++)
        {
            sum +=nums[i];
            while(sum>=target)
            {
                miny = Math.min(miny,i-j+1);
                sum -=nums[j];
                j++;
            }
        }
         if(miny<10000000)
         {
            return miny;
         }
       return 0;
    }
}