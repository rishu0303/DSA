class Solution {
    public int characterReplacement(String s, int k) {
        int[] chr = new int[26];
        int l = 0,r = 0, max = 0, res = 0, len = s.length();
        char ch;
        while(r<len){
            ch = s.charAt(r);
            chr[ch-'A']++;
            max = Math.max(max,chr[ch-'A']);
            if (r - l + 1 - max > k) { 
                chr[s.charAt(l)-'A']--;
                l++;
            }
            res = Math.max(max,r-l+1);
            r++;
        }
        return res;
    }
    // public int characterReplacement(String s, int k) {
        // int l = 0, r = 0, len = s.length(), count = 0,max = 0;
        // char ch,start = s.charAt(0);
        // while (r < len) {
        //     ch = s.charAt(r);
        //     if(ch==start)
        //         count++;
        //     else    x++;
        //     while(x>k){
        //         ch = s.charAt(l);
        //         if(ch!=start){
        //             x--;
        //             start = ch;
        //         }
        //     }
        // }
    // }
}