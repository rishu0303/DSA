class Solution {
    public boolean isCircularSentence(String s) {
        int l = s.length();  
        if(s.charAt(0)!=s.charAt(l-1))    return false;
        for(int i = 0;i<l;i++){
            if(s.charAt(i)==' '){
                if(s.charAt(i-1)!=s.charAt(i+1))    return false;
            }
        }
        return true;
    }
}