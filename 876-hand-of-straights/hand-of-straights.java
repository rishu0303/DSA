class Solution {
    public boolean isNStraightHand(int[] hand, int gs) {
        int len = hand.length;
        if(len%gs!=0)   return false;
        if(gs==1)   return true;
        // HashMap<Integer,Integer> map = new HashMap<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int ele:hand){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        while (!map.isEmpty()) {
            int key = map.firstKey(); 
            for (int i = 0; i < gs; i++) {
                int current = key + i;
                if (!map.containsKey(current)) return false; 
                map.put(current, map.get(current) - 1);
                if (map.get(current) == 0) map.remove(current);  
            }
        }
        return true;
    }
}