class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int len = prices.length-1;
        int [] ncost = new int[len+1]; 
        ncost[len] = prices[len];
        st.push(prices[len--]);
        while(len>=0){
            while(!st.isEmpty() && st.peek()>prices[len]){
                st.pop();
            }
            int temp = prices[len];
            if(st.isEmpty()) ncost[len]=prices[len];
            else ncost[len] = prices[len]-st.peek();
            st.push(temp);
            len--;
        }
        return ncost;
    }
}