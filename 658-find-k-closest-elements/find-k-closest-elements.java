class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ls = new ArrayList<>();
        int len = arr.length-1;
        int left = 0, right = len- 1;
        int mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (arr[mid] < x) left = mid + 1;
            else right = mid;
        }
        int l = left - 1, r = left;
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