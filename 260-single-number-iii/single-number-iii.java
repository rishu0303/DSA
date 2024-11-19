class Solution {
    public int[] singleNumber(int[] nums){
        int n = nums.length;
        int xor = 0;
        for(int i = 0;i<n;i++){
            xor^=nums[i];
        }
        int mask = xor^(xor&(xor-1));
        int a = 0;
        int b = 0;
        for(int i = 0;i<n;i++){
            if((mask & nums[i]) == 0)  a = a ^ nums[i];
            else b = b ^ nums[i];
        }
        int[] res = new int[2];
        res[0] = a;
        res[1] = b;
        return res;
    }
    // public int[] singleNumber(int[] nums) {
    //     int[] res = new int[2];
    //     Arrays.sort(nums);
    //     int n = nums.length;
    //     int index = 0;
    //     for(int i = 0;i<n-1;i++){
    //         if(nums[i]!=nums[i+1]){
    //             res[index++] = nums[i];
    //         }else i++;
    //     }
    //     if(index!=2) res[1] = nums[n-1];
    //     return res;
    // }
}