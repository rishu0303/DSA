class Solution {
    public String addSpaces(String s, int[] spaces) {
        // string builder
        char[] str=s.toCharArray();
        int l1 = str.length;
        int l2 = spaces.length;
        char[] res=new char[l1+l2];
        int i = 0;
        int j = 0;
        int idx = 0;
        while(i<l1){
            if(j<l2 && i==spaces[j]){
                res[idx]=' ';
                j++;
            }else{
                res[idx] = str[i];
                i++; 
            }
            idx++;
        }
        return new String(res);
    }
}