class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set  = new HashSet<>();
        int min = Integer.MAX_VALUE;
        boolean flag = true;
        for(int ele:nums){
            if(ele>=0){
                if(min>ele) min = ele;
                set.add(ele);
            }else flag = false;
        }
        if(min==Integer.MAX_VALUE) return 1;
        int i = 1;
        // if(flag)    i = min;
        for(;i<Integer.MAX_VALUE;i++){
            if(!set.contains(i))   break; 
        }
        return i;
    }
}