class Solution {
    public boolean canSortArray(int[] nums) {
        int len = nums.length-1;
        for(int i = 0;i<=len;i++){
            for(int j = 0;j<len-i;j++){
                if(nums[j]>nums[j+1] && setbit(nums[j])==setbit(nums[j+1])){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int i = 0;i<len;i++){
            if(nums[i]>nums[i+1])   return false;
        }
        return true;
    }
    int setbit(int val){
        int count = 0;
        while(val>0){
            if((val&1)==1){
                count++;
            }
            val = val>>1;
        }
        return count;
    }
}