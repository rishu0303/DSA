class Solution {
    public int numberOfSubstrings(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        int l = 0, r = 0, count = 0;
        int len = s.length();
        char ch;
        while(r<len){
            ch = s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()==3 && l<=r){
                ch = s.charAt(l++);
                count+=len-r;
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0)  map.remove(ch);
            }
            r++;
        }
        return count;
    }
    // public int numberOfSubstrings(String s) {
    //     int l = 0, r = 0, count = 0;
    //     int len = s.length();
    //     int a = 0,b = 0 ,c = 0;
    //     while(r<len){
    //         char ch = s.charAt(r);
    //         if(ch=='a') a++;
    //         if(ch=='b') b++;
    //         if(ch=='c') c++;
    //         if(a>0 && b>0 && c>0){
    //             count += len-r;
    //             a = 0;
    //             b = 0;
    //             c = 0;
    //             l++;
    //             r = l;
    //         }else
    //             r++;
    //     }
    //     return count;
    // }
}