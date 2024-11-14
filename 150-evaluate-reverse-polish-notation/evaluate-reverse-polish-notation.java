class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack();
        for(int i = 0;i<tokens.length;i++){
            int val = operator(tokens[i]);
            if(val==0) st.push(Integer.parseInt(tokens[i]));
            else{
                int b = st.pop();
                int a = st.pop();
                int res = 0;
                switch(val){
                    case 1:
                        res = a+b;
                        break;
                    case 2:
                        res = a-b;
                        break;
                    case 3:
                        res = a*b;
                        break;
                    case 4:
                        res = a/b;
                        break;
                }
                st.push(res);
            }
        }
        return st.pop();
    }
    int operator(String ele){
        if(ele.equals("+"))  return 1;
        if(ele.equals("-"))  return 2;
        if(ele.equals("*"))  return 3;
        if(ele.equals("/"))  return 4;
        return 0;
    }
}