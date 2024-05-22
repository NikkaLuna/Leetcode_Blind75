
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {

    public int maxLevelSum(TreeNode root) {
        
        if (root == null) return 0;

        int maxSum = Integer.MIN_VALUE, maxLevel = 1, level = 1;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
    

        while (!queue.isEmpty()) {

            int levelSize = queue.size(), sum = 0;

            for (int i = 0; i < levelSize; i++) {

                TreeNode node = queue.poll();
                sum += node.val;

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxLevel = level;
            }
            level++;
        }
        return maxLevel;
    }
}



