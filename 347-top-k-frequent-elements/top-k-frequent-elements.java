class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq = 
            new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        int len = nums.length;
        int[] res = new int[k];
        for(int i = 0;i<len;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry);
        }
        int i = 0;
        while(i<k){
            res[i++] = pq.poll().getKey();
        }
        return res;
    }
}