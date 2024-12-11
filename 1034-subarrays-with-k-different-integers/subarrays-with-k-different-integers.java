class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }

    public int helper(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int l = 0, sum = 0, count = 0;
        int len = arr.length;
        for (int r = 0; r < len; r++) {
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            while(l<=r && map.size()>k){
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0)  map.remove(arr[l]);
                l++;
            }
            count+=(r-l+1);
        }
        return count;
    }
}