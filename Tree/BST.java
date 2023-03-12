//Binary Search Tree
//Search - O(logn) Insert - O(logn) Delete - O(logn)

package Tree;

//every left child is smaller than the parent and every right child is larger than the parent
public class BST {
    private int minValue = Integer.MIN_VALUE;
    private int maxValue = Integer.MAX_VALUE;
    private Node prev = null;
    boolean isBST(Node root){
        if(root != null){
            if(!isBST(root.left)) return false;
            if(prev != null && root.data <= prev.data) return false;
            prev = root;
            return isBST(root.right);
        }
        return true;
    }
    public int maxValue(Node root){
        int maxValue = root.data;
        while(root.right != null){
            maxValue = root.right.data;
            root = root.right;
        }
        return maxValue;
    }
    public int minValue(Node root){
        int minv = root.data;
        while(root.left != null){
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
    public Node delete(Node root , int key){
        if(root == null) return root;
        if(key < root.data) root.left = delete(root,key);
        else if(key > root.data) root.right = delete(root,key);
        else{
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            root.data = minValue(root.right);
            root.right = delete(root.right,root.data);
        }
        return root;
    }
    //tc :- O(h) sc :- O(h)
    public Node insert(Node root, int key){
        if(root == null) return new Node(11);
        if(root.data < key) root.right = insert(root.right,key);
        else root.left = insert(root.left,key);
        return root;
    }
    public boolean search(Node root , int key){
        if(root == null) return false;
        if(root.data == key) return true;
        if(root.data < key) return search(root.right,key);
        return search(root.left,key);
    }
    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();
        BST bst = new BST();
        Node root = bt.createTree();
        System.out.println("element present :- "+bst.search(root,5));
    }
}
