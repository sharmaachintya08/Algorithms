//Binary Search Tree
//Search - O(logn) Insert - O(logn) Delete - O(logn)

package Tree;

//every left child is smaller than the parent and every right child is larger than the parent
public class BST {
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
