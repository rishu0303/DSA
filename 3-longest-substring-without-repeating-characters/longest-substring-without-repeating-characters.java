// class Solution {
// public int lengthOfLongestSubstring(String str) {
//     int len = str.length();
//     if(len<=1){
//         return len;
//     }
//     HashSet<Character> set = new HashSet<>();
//     int s = 0;
//     int e = 0;
//     char ch;
//     int max = 0;
//     while(e<len){
//         ch = str.charAt(e);
//         if(set.contains(ch)){
//             set.clear();
//             s++;
//             e=s;
//         }else{
//             set.add(ch);
//             e++;
//         }
//         max = Math.max(e-s,max);
//     }
//     return max;
// }
// 
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int start = 0;
        int len  = s.length();
        for (int end = 0; end < len; end++) {
            char current = s.charAt(end);
            if (map.containsKey(current) && map.get(current) >= start) {
                start = map.get(current) + 1;
            }
            map.put(current, end);
            max = Math.max(max, end - start + 1);
        }
        return max;
    }
}