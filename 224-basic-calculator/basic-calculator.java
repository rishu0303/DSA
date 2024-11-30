class Solution {
//     public int calculate(String s){
//         // stack ghusna hoga
//         int len = s.length();
//         int operand = 0;
//         char sign = '+';
//         for(int i = 0;i<len;i++){
//             char ch = s.charAt(i);
//             if(ch == '(' || ch == ')' ||  ch==' ')  continue;
//             else if(ch=='+')    sign = '+';
//             else if(ch == '-')  sign = '-';
//             else{
//                 if(sign == '+'){
//                     operand = operand+(ch-48);
//                 }else{
//                     operand = operand-(ch-48);
//                 }
//             }
//         }
//         return operand;
//     }
// }
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;
        int number = 0;
        int sign = 1;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                number = 10 * number + (int)(c - '0');
            }else if(c == '+'){
                result += sign * number;
                number = 0;
                sign = 1;
            }else if(c == '-'){
                result += sign * number;
                number = 0;
                sign = -1;
            }else if(c == '('){
                stack.push(result);
                stack.push(sign);
                sign = 1;   
                result = 0;
            }else if(c == ')'){
                result += sign * number;  
                number = 0;
                result *= stack.pop(); 
                result += stack.pop();  
                
            }
        }
        if(number != 0) result += sign * number;
        return result;
    }
}