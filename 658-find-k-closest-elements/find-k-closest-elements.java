class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ls = new ArrayList<>();
        int s = 0, len = arr.length-1, e = len;
        int mid = 0, index = 0;
        boolean flag = false;
        while(s<=e){
            mid = s+(e-s)/2;
            if(arr[mid]==x) {
                flag = true;
                break;
            }else if(arr[mid]<x)    s = mid+1;
            else e = mid-1;
        }
        int l,r;
        if(flag){
            l = mid-1;
            r = mid;
        }else{
            l = s-1;
            r = s;
        }
        while(k>0){
            if(l<0){
                ls.add(arr[r++]);
            }
            else if(r>len && k>0){
                ls.add(0,arr[l--]);
            }
            else if(k>0 && Math.abs(x-arr[l])<=Math.abs(x-arr[r])){
                ls.add(0,arr[l--]);
            }else{
                ls.add(arr[r++]);
            }
            k--;
        }
        return ls;
    }
}