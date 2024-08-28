//Example : Input: nums = [1,2,3]
//Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0 , new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int first, List<Integer> path, 
    List<List<Integer>> result){
        result.add(new ArrayList<>(path));
        for (int i = first; i < nums.length; i++) {
            path.add(nums[i]);
            backtrack(nums, i + 1, path, result);
            path.remove(path.size() - 1);
    }
}}

