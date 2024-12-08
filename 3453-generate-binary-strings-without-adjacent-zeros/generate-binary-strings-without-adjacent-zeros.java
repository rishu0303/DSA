class Solution {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        generate(n, new StringBuilder(), result);
        return result;
    }
    public void generate(int n, StringBuilder s,List<String> res){
        if(s.length() == n){
            res.add(s.toString());
            return;
        }
        s.append('0');
        int len = s.length();
        if (!(len >= 2 && s.charAt(len - 1) == '0' && s.charAt(len - 2) 
        == '0')) {
            generate(n,s,res);
        }
        s.deleteCharAt(s.length()-1);

        s.append('1');
        len = s.length();
        if (!(len >= 2 && s.charAt(len - 1) == '0' && s.charAt(len - 2) 
        == '0')) {
            generate(n,s,res); 
        }
        s.deleteCharAt(s.length()-1);
    }
}