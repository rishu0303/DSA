class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        boolean[] arr=new boolean[10001];
        for(int i=0; i<banned.length; i++){
            arr[banned[i]] = true;
        }

        long sum=0;
        int cnt=0;
        for(int i=1; i<=n; i++){
            if(arr[i]){continue;}
            sum+=i;
            if(sum>maxSum){
               break;
            }
            cnt++;
        }

        return cnt;
    }
}