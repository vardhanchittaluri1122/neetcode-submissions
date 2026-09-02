class Solution {
    public void rotate(int[] arr, int k) { 
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
        
    }
}