class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    void backtrack(int i, int[] nums, List<Integer> temp,
                   List<List<Integer>> ans) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        // Take
        temp.add(nums[i]);
        backtrack(i + 1, nums, temp, ans);

        // Skip
        temp.remove(temp.size() - 1);
        backtrack(i + 1, nums, temp, ans);
    }
}