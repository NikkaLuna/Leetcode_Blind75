

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}

class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        
        return pathSumHelper(root, targetSum, 0, new HashMap<>());
    }
    
    private int pathSumHelper(TreeNode node, int targetSum, long currentSum, Map<Long, Integer> prefixSum) {
        if (node == null) {
            return 0;
        }
        
        currentSum += node.val;
        int result = (currentSum == targetSum) ? 1 : 0;
        
        if (prefixSum.containsKey(currentSum - targetSum)) {
            result += prefixSum.get(currentSum - targetSum);
        }
        
        prefixSum.put(currentSum, prefixSum.getOrDefault(currentSum, 0) + 1);
        
        result += pathSumHelper(node.left, targetSum, currentSum, prefixSum);
        result += pathSumHelper(node.right, targetSum, currentSum, prefixSum);
        
        prefixSum.put(currentSum, prefixSum.get(currentSum) - 1);
        
        return result;
    }
}

