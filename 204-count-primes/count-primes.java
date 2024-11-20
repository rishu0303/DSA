class Solution {
    public int countPrimes(int n) {
        if(n<2) return 0;
        boolean nums[] = new boolean[n+1];
        nums[0] = true;
        nums[1] = true;
        int count = 0;
        for(int i = 2;i<n;i++){
            if(!nums[i]){
                count++;
                int j = i;
                while(j<=n){
                    nums[j] = true;
                    j +=i;
                }
            }
        }
        return count;
    }
}