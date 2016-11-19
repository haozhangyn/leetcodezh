
public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        int temprightmax=1;
        int templeftmax=1;
       if(root==null) return 0;
       else{
           if(root.left!=null) {
            
             templeftmax=maxDepth(root.left)+1;
           }if(root.right!=null){
               temprightmax=maxDepth(root.right)+1;
           }
         
       }
       return (temprightmax>templeftmax)?temprightmax:templeftmax;
   }
}
