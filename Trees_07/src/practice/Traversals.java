package src.practice;
//import common.TreeNode;

import src.common.TreeNode;
import src.common.TreeUtils;
import src.common.TreePrinter;

public class Traversals {

//    This method
    public static void preOrderTraversal(TreeNode root){
        if(root ==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void inOrderTraversal(TreeNode root){
        if(root==null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }

    public static void postOrderTraversal(TreeNode root){
        if(root==null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");

    }

    public static void main(String[] args) {
        TreeNode root = TreeUtils.getComplexTree();
        System.out.println("YOUR TREE STRUCTURE:");
        TreePrinter.printNode(root);
        System.out.println();
        System.out.println("preOrder Traversal");
        preOrderTraversal(root);
        System.out.println();
        System.out.println("Inorder Traversal");
        inOrderTraversal(root);
        System.out.println();
        System.out.println("Postorder Traversal");
        postOrderTraversal(root);
    }
}
