package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;


class Node{
    Node left , right;
    int data;
    public Node(int data){
        this.data = data;
    }
}
public class BinaryTree {
    private  Scanner sc;
    private  Queue<Node> queue;
    private  Node prev = null;
    private  Node head = null;

    //Lowest Common Ancestor in a Binary Tree
    public Node lca(Node root , int n1 , int n2){
        if(root == null) return null;
        if(root.data == n1 || root.data == n2) return root;
        Node left = lca(root.left,n1,n2);
        Node right = lca(root.right,n1,n2);
        if(left == null) return right;
        if(right == null) return left;
        return root;
    }
    //Number of nodes in the largest path bw 2 leaf nodes
    //o(n^2)
    public int DiameterOfBT(Node root){
        if(root == null) return 0;
        int dl = DiameterOfBT(root.left);
        int dr = DiameterOfBT(root.right);
        int cur = height(root.left) + height(root.right) + 1;
        return Math.max(cur,Math.max(dl,dr));
    }
    public void convertToDLL(Node root){
        if(root == null) return ;
        convertToDLL(root.left);
        if(prev == null) head = root;
        else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        convertToDLL(root.right);
    }
    public void printRightViewUtil(Node root , ArrayList list, int level){
        if(root == null) return;
        if(list.get(level) == null){
            list.set(level,root);
        }
        printRightViewUtil(root.right,list,level+1);
        printRightViewUtil(root.left,list,level+1);
    }
    public void printRightView(Node root){
        ArrayList<Node> list = new ArrayList<>();
        printRightViewUtil(root,list,0);
        for(Node curr : list){
            System.out.print(curr.data+"\t");
        }
    }
    public void printLeftViewUtil(Node root , ArrayList list, int level){
        if(root == null) return;
        if(list.get(level) == null){
            list.set(level,root);
        }
        printLeftViewUtil(root.left,list,level+1);
        printLeftViewUtil(root.right,list,level+1);
    }
    public void printLeftView(Node root){
        ArrayList<Node> list = new ArrayList<>();
        printLeftViewUtil(root,list,0);
        for(Node curr : list){
            System.out.print(curr.data+"\t");
        }
    }
    public void traverseAllLevel(Node root){
        if(root == null) return;
        queue.add(root);
        while(!queue.isEmpty()){
            Node curr = queue.poll();
            System.out.println(curr.data);
            if(curr.left != null){
                queue.add(curr.left);
            }
            if(curr.right != null){
                queue.add(curr.right);
            }
        }
    }
    //tc :- O(N^2) sc :- O(h)
    public void printCurrentLevel(Node root,int level){
        if(root == null){
            return ;
        }
        if(level == 1){
            System.out.print("data at current level :- "+root.data+"\t");
        }else if(level > 1){
            printCurrentLevel(root.left, level - 1 );
            printCurrentLevel(root.right, level - 1 );
        }
    }
    public int findMinNode(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.min(root.data,Math.min(findMinNode(root.left),findMinNode(root.right)));
    }
    public int findMaxNode(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data,Math.max(findMaxNode(root.left),findMaxNode(root.right)));
    }
    public int size(Node root){
        if(root == null) return 0;
        return size(root.left) + size(root.right) + 1;    
    }
    public int height(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right)) + 1;
    }
    public  void postorderTrav(Node root){
        //L-R-N
        if(root == null){
            return;
        }
        postorderTrav(root.left);
        postorderTrav(root.right);
        System.out.print(root.data);
    }
    public  void preorderTrav(Node root){
        //N-L-R
        if(root == null){
            return;
        }
        System.out.print(root.data);
        preorderTrav(root.left);
        preorderTrav(root.right);
    }
    public  void inorderTrav(Node root){
        //L-N-R
        if(root == null){
            return;
        }
        inorderTrav(root.left);
        System.out.print(root.data);
        inorderTrav(root.right);

    }
    public  void printTree(Node root){
        if(root == null){
            return ;
        }
        System.out.print("[");
        System.out.print(root.data);
        printTree(root.left);
        printTree(root.right);
        System.out.print("]");
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
        BinaryTree bt = new BinaryTree();
        bt.sc = new Scanner(System.in);
        bt.queue = new ArrayDeque<>();
        Node root = bt.createTree();
        bt.printTree(root);
        System.out.println();
        bt.inorderTrav(root);
        System.out.println();
        bt.preorderTrav(root);
        System.out.println();
        bt.postorderTrav(root);
        System.out.println();
        System.out.println("Total height of the tree "+bt.height(root));
        System.out.println("total size of the tree "+bt.size(root));
        System.out.println("maximum element in the tree "+bt.findMaxNode(root));
        System.out.println("minimum element in the tree "+bt.findMinNode(root));
        System.out.println();
        bt.printCurrentLevel(root, 4);
    }
}
