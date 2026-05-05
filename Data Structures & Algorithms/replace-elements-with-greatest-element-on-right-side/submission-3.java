class Solution {
    public int[] replaceElements(int[] arr) {
        int l=-1;
        int[] a=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            a[i]=l;
            l=Math.max(l,arr[i]);
        }
        return a;

    }
}