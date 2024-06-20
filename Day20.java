class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[501];  
        for (int num : arr) {
            freq[num]++;
        }
        int largestLucky = -1;
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == i) {
                largestLucky = i;
            }
        }
        return largestLucky;
    }
}
