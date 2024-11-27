class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:nums1){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        ArrayList<Integer> ls= new ArrayList<>();
        for(int ele:nums2){
            int freq = map.getOrDefault(ele,0);
            if(freq>0){
                map.put(ele,freq-1);
                ls.add(ele);
            }
        }

        int []res=new int [ls.size()];
        int index=0;
        for(int a:ls){
          res[index++]=a;
        }
        return res;
    }
}