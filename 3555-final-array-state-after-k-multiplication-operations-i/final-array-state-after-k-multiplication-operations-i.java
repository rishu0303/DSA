class Solution {
    public int[] getFinalState(int[] nums, int k, int m) {
        int n = nums.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        for(int i = 0;i<n;i++){
            pq.add(new int[]{nums[i],i});
        }
        for(int i = 0; i<k ; i++){
            int index = pq.poll()[1];
            nums[index]*=m;
            pq.add(new int[]{nums[index],index});
        }
        return nums;
    }
}