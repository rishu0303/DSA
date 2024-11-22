public class Solution {
    public int calculate(String s) {
        int len = s.length();
        if(s==null || len==0) return 0;
        Stack<Integer> stack = new Stack<Integer>();
        int num = 0;
        char sign = '+';
        for(int i=0;i<len;i++){
            char next = s.charAt(i);
            if(Character.isDigit(next)){
                num = num*10+next-'0';
            }
            if((!Character.isDigit(next) &&' '!=next) || i==len-1){
                if(sign=='-'){
                    stack.push(-num);
                }
                if(sign=='+'){
                    stack.push(num);
                }
                if(sign=='*'){
                    stack.push(stack.pop()*num);
                }
                if(sign=='/'){
                    stack.push(stack.pop()/num);
                }
                sign = next;
                num = 0;
            }
        }

        int re = 0;
        for(int i:stack){
            re += i;
        }
        return re;
    }
}