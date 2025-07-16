public class Times {
    public static void main(String args[]){
        int arr[]={10,10,5,10,5,6};
        boolean []isVis=new boolean[arr.length];
       
        for(int i=0;i<arr.length;i++){
            if(isVis[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    isVis[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " +count);
        }
    }
}
