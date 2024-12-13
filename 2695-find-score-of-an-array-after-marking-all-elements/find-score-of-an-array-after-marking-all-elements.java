class Solution {
    public long findScore(int[] nums) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0]!=b[0]?a[0] - b[0]:a[1]-b[1]);
        int len = nums.length;
        for(int i = 0;i<len;i++){
            pq.add(new int[]{nums[i],i});
        }
        long sum = 0;
        while(!pq.isEmpty()){
            int[] arr = pq.poll();
            int ele = arr[0];
            int pos = arr[1];
            if(nums[pos]!=-1){
                sum+=ele;
                nums[pos] = -1;
                if(pos-1>=0)   nums[pos-1] = -1; 
                if(pos+1<len)   nums[pos+1] = -1; 
            }
        }
        return sum;
    }
}