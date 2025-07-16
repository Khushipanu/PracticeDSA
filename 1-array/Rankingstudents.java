public class Rankingstudents {
    public static int rank(int arr[]){
        int n=arr.length;
        int s=arr[0];
        int cut=0;
        for(int i=1;i<n;i++){
            int p=i-1;
            if(arr[i]<arr[p]){
                cut++;
            }
        }
        return cut;

    }
  public static void main(String[] args){
    int arr[]={4,3,7,2,6,1};
    System.out.println(rank(arr));
    

}
    
}
