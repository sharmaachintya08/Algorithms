//Binary Search Tree
//Search - O(logn) Insert - O(logn) Delete - O(logn)

package Tree;

import java.util.HashSet;
import java.util.Scanner;

class Node{
    Node left , right;
    int data;
    public Node(int data){
        this.data = data;
    }
}

//every left child is smaller than the parent and every right child is larger than the parent
public class BST {

    private int minValue = Integer.MIN_VALUE;
    private int maxValue = Integer.MAX_VALUE;
    private Scanner sc = new Scanner(System.in);
    private Node prev = null;

    //pair with the given sum in a bst
    public boolean pairPresent(Node root , int sum , HashSet<Integer> set){
        if(root == null) return false;
        if(pairPresent(root.left,sum,set) == true) return true;
        if(set.contains(sum - root.data)) return true;
        set.add(root.data);
        return pairPresent(root.right,sum,set);
    }
    //floor value, key se choti but sabse badi value tree me
    public void floorVal(Node root , int key){
        int ans = Integer.MIN_VALUE;
        while(true){
            if(root == null) break;
            if(root.data < key ){
                if(root.data > ans){
                    ans = root.data;
                }
                root = root.right;
            }else if(root.data > key){
                root = root.left;
            }
        }
        System.out.println("floor val :- "+ans);
    }
    //ciel value, key se badi but sabse choti value tree me
    public void cielVal(Node root , int key){
        int ans = Integer.MAX_VALUE;
        while(true){
            if(root == null) break;
            if(root.data > key){
                if(root.data < ans){
                    ans = root.data;
                }
                root = root.left;
            }else if(root.data < key) root = root.right;
        }
        System.out.println("ciel value : "+ans);
    }
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
    public Node createTree(){
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
        BST bst = new BST();
        Node root = bst.createTree();
        System.out.println("element present :- "+bst.search(root,5));
        bst.floorVal(root,11);
        bst.cielVal(root,11);
        HashSet<Integer> set = new HashSet<>();
        bst.pairPresent(root, 20, set);
    }
}
