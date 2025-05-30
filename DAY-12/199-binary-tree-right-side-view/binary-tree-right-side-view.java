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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer> ans=new ArrayList<>();
        Queue<TreeNode>q=new ArrayDeque<>(List.of(root));// to get one level nodes


        while(!q.isEmpty())
        {
            final int size=q.size();
            //get no. of nodes on one level
            for(int i=0;i<size;i++)
            {
                TreeNode node=q.poll();// keep removing till last
                if(i==size-1){ans.add(node.val);}// add kr last ko
                if(node.left!=null){q.offer(node.left);}
                if(node.right!=null){q.offer(node.right);}

            }
        }
        return ans;

    }
   
}