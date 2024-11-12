class Solution {
    // public int findPairs(int[] nums, int k) {
    //     HashSet<Integer> set = new HashSet<>();
    //     int count = 0;
    //     for(int i = 0;i<nums.length;i++){
    //         if(!set.contains(nums[i])){
    //             if(set.contains(Math.abs(nums[i]+k))){
    //                 count++;
    //             }
    //             set.add(nums[i]);
    //         }
    //     }
    //     return count;
    // }
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(i!=nums.length-1 && nums[i]==nums[i+1])  continue;
            int key = nums[i]+k;
            int s = 0;
            int e = nums.length-1;
            int mid;
            while(s<=e){
                mid = s+(e-s)/2;
                // if(mid!=i){
                //     mid = mid-1;
                //     continue;
                // }
                if(mid!=i&&nums[mid]==key){
                    count++;
                    break;
                }else if(nums[mid]<key)   s = mid+1;
                else e = mid-1;
            }
        }
        return count;
    }
}