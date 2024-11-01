class Solution {
    public String makeFancyString(String s) {
        int freq = 1;
        int len = s.length();
        StringBuilder str = new StringBuilder();
        char prev=' ',ch;
        for(int i = 0;i<len;i++){
            ch = s.charAt(i);
            if(ch==prev)    freq++;
            else{
                freq = 0;
            }
            prev = ch;
            if(freq<2){
                str.append(ch);
            }
        }
        return str.toString();
    }
}