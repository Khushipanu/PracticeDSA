public class BuyOrNot {
    public static boolean buyOrnot(int arr[]){
        int n=arr.length;
        int b_total_rupee=0;
        int x_coupen=100;
        int y_discount=150;
        int a_total_rupee=0;
        int a_paid;
        for(int i=0;i<n;i++){
            b_total_rupee+=arr[i];
        }

        for(int i=0;i<n;i++){
            a_total_rupee+=(arr[i]+(n*x_coupen)); 
        }
        y_discount*=n;
        a_paid=a_total_rupee - y_discount;

        if(b_total_rupee>a_paid){
            return true;
        }
        else{
            return false;
        }   

        }
    
    public static void main(String args[]){
        int arr[]={100,200,300,400};
        if(buyOrnot(arr)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}

