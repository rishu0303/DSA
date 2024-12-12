class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:gifts){
            pq.add(ele);
        }
        while(k-->0){
            int ele = pq.poll();
            pq.add((int)Math.sqrt(ele));
        }
        long sum = 0;
        while(!pq.isEmpty()){
            sum+=pq.poll();
        }
        return sum;
    }
}