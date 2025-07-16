class Union {
      public static int[] unionArray(int[] nums1, int[] nums2) {
        int idx1=0;
        int idx2=0;
        int total[]=new int[nums1.length + nums2.length];
        int k=0;
        while(idx1<nums1.length && idx2<nums2.length){
            if(nums1[idx1]< nums2[idx2]){
            total[k++]=nums1[idx1++];
            }else{
                total[k++]=nums2[idx2++];
            }
        }
        while(idx1<nums1.length){
             total[k++]=nums1[idx1++];
        }
        while(idx2<nums2.length){
            total[k++]=nums2[idx2++];
        }
        int count=0;
        for(int i=0;i<k;i++){
            if(i==0 || total[i]!=total[i-1]){
                count++;
            }
        }
        int ans[]=new int[count];
        int p=0;
    for(int i=0;i<k;i++){
            if(i==0 || total[i]!=total[i-1]){
               ans[p++]=total[i];
            }
        }
        return ans;
        
        
        
    }
   
        
        
    
    public static void main(String args[]){
        int nums1[]={3,4,6,7,9,9};
        int nums2[]={1,5,7,8,8};
        int ans[]=unionArray(nums1,nums2);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]);
        }
    }
}