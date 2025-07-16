public class Zpattern {
    public static void printZ(int arr[][]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i==0 || i==n-1){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]);

                }
            }
            else{
                for(int j=0;j<n;j++){
                if(i+j==n-1){
                    System.out.print(arr[i][j]);
                }
                
                }

            }
        }

    }
    public static void main(String args[]){
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        printZ(arr);

    }
    
}
