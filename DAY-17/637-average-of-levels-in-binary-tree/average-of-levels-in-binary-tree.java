/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>ans=new ArrayList<>();
        Queue<TreeNode>q=new ArrayDeque<>(List.of(root));

        while(!q.isEmpty())
        {
            long sum=0;
            final int size=q.size();
            for(int i=0;i<size;++i)
            {
                TreeNode node=q.poll();
                sum+=node.val;
                if(node.left!=null){q.offer(node.left);}
                if(node.right!=null){q.offer(node.right);}

            }
            ans.add(sum/(double)size);
        }
        return ans;
    }
}