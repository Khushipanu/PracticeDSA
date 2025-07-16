public class SetZ {
    public static void main(String[] args) {
        int arr[][]={
            {1,1,1},
            {1,0,1},
            {1,1,1} 
        };
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0){ //1,1=> 0

                   for(int k=0;k<arr.length;k++){
                    if(arr[k][j]!=0){
                        arr[k][j]=-1;
                    }   
                   }
                   for(int k=0;k<arr[i].length;k++){
                    if(arr[i][k]!=0){
                        arr[i][k]=-1;
                    }
                    
                  }

                }
            }
        }
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]==-1){
                arr[i][j]=0;
            }
        }
       }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    } 
}
