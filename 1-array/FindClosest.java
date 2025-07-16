public class FindClosest {
    public static void findingclosest(int arr[],int target){
        int n=arr.length;
        int si=0;
        int ei=n-1;
        if(target<arr[0]){
            System.out.println("negative ka"+arr[0]);
            return;
        }
        if(target>arr[n-1]){
            System.out.println("itna bada number lo fir"+arr[n-1]);
            return;
        }
        while(si<=ei){ 
            int mid=(si+ei)/2;
            if(mid==target){
                System.out.println("this is closest"+arr[mid]);
                break;

            }
            else if(arr[mid]<target){
                if(mid<n-1 && target<arr[mid+1]){
                    if(target-arr[mid]>=arr[mid+1]-target){
                        System.out.println("this"+arr[mid+1]);
                    }
                    else{
                        System.out.println("this"+arr[mid]);
                    }
                    return;
                }
                si=mid+1;
            }
            else{
                if(mid>0 && target>arr[mid-1]){
                    if(target-arr[mid-1] >= arr[mid]-target){
                        System.out.println("this "+arr[mid]);
                    }
                    else{
                        System.out.println("this"+arr[mid-1]);
                    }
                    return;
                }
           
                ei=mid-1;

            }




        }
        
    }

    public static void main(String args[]){
        int arr[]={1,2,4,4,6,9,10};
        findingclosest(arr,7);

    }
    
}
