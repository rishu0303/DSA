class Solution {
    public int longestSquareStreak(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        int ele;
        for(int i = 0;i<nums.length;i++){
            int count = 0;
            ele = nums[i];
            if(ele==-1)   continue;
            while(true){
                int pos = Arrays.binarySearch(nums,ele);
                if(pos<0)     break;
                count++;
                ele = ele*ele;
                nums[pos] = -1;
            }
            max = Math.max(max,count);
        }
        if(max==1)  return -1;
        return max;
    }
}