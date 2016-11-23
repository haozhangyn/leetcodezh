/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class InvertBinaryTree {
	 public TreeNode invertTree(TreeNode root) {
	     
	        if(root!=null){
	            TreeNode tempNode;
	            tempNode=root.left;
	            root.left=root.right;
	            root.right=tempNode;
	            invertTree(root.left);
	            invertTree(root.right);
	        }
	        return root;
	    }
/**
 *   if (root == null) {
       return null;
   }
   
   Queue<TreeNode> q = new LinkedList<TreeNode>();
   q.offer(root);
   
   while (!q.isEmpty()) {
       TreeNode polled = q.poll();
       
       if (polled.left != null || polled.right != null) {
           
           TreeNode temp = polled.left;
           polled.left = polled.right;
           polled.right = temp;
           
           if (polled.left != null) q.offer(polled.left);
           if (polled.right != null) q.offer(polled.right);
           
       }
       
   }
   
   return root;
 * */
}
