public class Leetcode226 {

  public TreeNode invertBinaryTree(TreeNode root) {
    if(root==null)
        return root;
     
     invertBinaryTree(root.left);
     invertBinaryTree(root.right);
     
     TreeNode temp = root.left;
     root.left=root.right;
     root.right=temp;
     
     return root;
  } 
  
  public TreeNode invertBinaryTreeIteratively(TreeNode root) {
    LinkedList<TreeNode> queue = new LinkedList<>();
    if(root!=null)
      queue.add(root);
      
    while(!queue.empty()) {
      TreeNode node = queue.poll();
      if(node.left!=null) 
        queue.add(node.left);
      if(node.right!=null)
        queue.add(node.right);
      TreeNode temp = node.left;
      node.left=node.right;
      node.right=temp;
    }
    
    return root;
  }
}

class TreeNode {
  int data;
  TreeNode left;
  TreeNode right;
  
  TreeNode(int data) {
    this.data=data;
  }
  TreeNode(int data, TreeNode left, TreeNode right) {
    this.data=data;
    this.left=left;
    this.right=right;
  }
}
