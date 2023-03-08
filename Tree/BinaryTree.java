package Tree;

import java.util.Scanner;


class Node{
    Node left , right;
    int data;
    public Node(int data){
        this.data = data;
    }
}
public class BinaryTree {
    private static Scanner sc;
    static int findMinNode(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.min(root.data,Math.min(findMinNode(root.left),findMinNode(root.right)));
    }
    static int findMaxNode(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data,Math.max(findMaxNode(root.left),findMaxNode(root.right)));
    }
    static int size(Node root){
        if(root == null) return 0;
        return size(root.left) + size(root.right) + 1;    
    }
    static int height(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right)) + 1;
    }
    public static void postorderTrav(Node root){
        //L-R-N
        if(root == null){
            return;
        }
        postorderTrav(root.left);
        postorderTrav(root.right);
        System.out.print(root.data);
    }
    public static void preorderTrav(Node root){
        //N-L-R
        if(root == null){
            return;
        }
        System.out.print(root.data);
        preorderTrav(root.left);
        preorderTrav(root.right);
    }
    public static void inorderTrav(Node root){
        //L-N-R
        if(root == null){
            return;
        }
        inorderTrav(root.left);
        System.out.print(root.data);
        inorderTrav(root.right);

    }
    public static void printTree(Node root){
        if(root == null){
            return ;
        }
        System.out.print("[");
        System.out.print(root.data);
        printTree(root.left);
        printTree(root.right);
        System.out.print("]");
    }
    public static Node createTree(){
        Node root = null;
        System.out.println("enter data :- ");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        root = new Node(data);
        System.out.println("left child for "+data);
        root.left = createTree();
        System.out.println("right child for "+data);
        root.right = createTree();
        return root;
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        Node root = createTree();
        printTree(root);
        System.out.println();
        inorderTrav(root);
        System.out.println();
        preorderTrav(root);
        System.out.println();
        postorderTrav(root);
        System.out.println();
        System.out.println("Total height of the tree "+height(root));
        System.out.println("total size of the tree "+size(root));
        System.out.println("maximum element in the tree "+findMaxNode(root));
        System.out.println("minimum element in the tree "+findMinNode(root));
    }
}
