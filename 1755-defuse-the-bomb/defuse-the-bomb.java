class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];
        if(k==0)    return res;
        if(k>0){
            int val = 0;
            int i;
            for(i = 0;i<k;i++){
                val+=code[i];
            }
            for(int j = 0;j<n;j++){
                val-=code[j];
                val+=code[(i+j)%n];
                res[j] = val;
            }
        }else{
            int s = n+k;
            int e = n-1;
            int sum = 0; 
            for(int i=s; i<=e; i++)
                sum += code[i];
            for(int i=0; i<n; i++){
                res[i] = sum ; 
                sum = sum - code[(s)%n];
                sum = sum + code[(e+1)%n]; 
                s++; 
                e++;  
            }
        }
        return res;
    }
}