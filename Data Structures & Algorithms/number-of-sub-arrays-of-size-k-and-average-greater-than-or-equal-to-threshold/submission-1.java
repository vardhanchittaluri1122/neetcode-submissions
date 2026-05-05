class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int r=0;
        int s=0;
        int k1=k-1;
        int sum=0;
        int c=0;
        int avg=0;
        while(r < arr.length){
            if(r<k1){
                sum=sum+arr[r];
            }  
            if(r-s == k1){
                sum=sum+arr[r];
                if(sum/k >= threshold){
                    c++;
                }
                sum=sum-arr[s];
                s++;
            }
            r++;
        }
        return c;
    }
}