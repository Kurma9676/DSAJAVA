class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        List<Integer> missing = new ArrayList<>();
        int i = 1;
        while (missing.size() < k) {
            if (!list.contains(i)) {
                missing.add(i);
            }
            i++;
        }

        return missing.get(k - 1); // 0-based indexing
    }
}
