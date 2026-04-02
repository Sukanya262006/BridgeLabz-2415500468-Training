import java.util.Stack;
public class NextGreatestElementStack {
    public int[] nextGreaterElement(int[] num){
        int n=num.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=num[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }
            st.push(num[i]);
        }
        return ans;

    }
}