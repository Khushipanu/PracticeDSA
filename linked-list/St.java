import java.util.Stack;

public class St {
     public static int [] calculateSpan (int[] arr) {
        Stack<Integer> st=new Stack<>();
        st.push(0);
        int ans[]=new int[arr.length];
        ans[0]=1;
        for(int i=1;i<arr.length;i++){
            
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=i+1;
            }
            else{
                ans[i]=i-st.peek();
            }
            st.push(i);
        }
        return ans;
        
        
    }
    public static void main(String args[]){
        int arr[]={100,80,60,70,60,75,85};
        int ans[]=calculateSpan(arr);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

        

    }
    
}
