class Solution {
    public List<String> letterCombinations(String digits) {
        char[][] map = {
            {},
            {},
            {'a','b','c'},
            {'d','e','f'},
            {'g','h','i'},
            {'j','k','l'},
            {'m','n','o'},
            {'p','q','r','s'},
            {'t','u','v'},
            {'w','x','y','z'}
        };
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return res;
        }
        generate(digits,0,new StringBuilder(),res,map);
        return res;
    }
    public void generate(String num,int idx, StringBuilder str, List<String> ls, char[][] map){
        if(idx==num.length()){
            ls.add(str.toString());
            return;
        }
        for (char ch : map[num.charAt(idx)-48]) {
            str.append(ch);
            generate(num,idx+1,str,ls,map);
            str.deleteCharAt(str.length()-1);
        }
    }
}