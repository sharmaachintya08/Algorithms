//flatten a multilevel linked list using linkedlist
//problem

class Node{
    int data;
    Node next;
    Node down;
    public Node(int data){
        this.data = data;
    }
}
public class MultiLevelLS {
    public static void printList(Node head){
        if(head == null) return;
        Node temp = head;
        System.out.print(" "+temp.data+" ");
        if(temp.down != null){
            System.out.print("[");
            printList(temp.down);
            System.out.print("]");
        }
        printList(temp.next);
    }
    public static void printFlattenedList(Node head){
        Node temp = head;
        System.out.println();
        while(temp != null){
            System.out.print(temp.data+"--->");
        }
    }
    public static Node flattenList(Node head){
        
    }
    public static void main(String[] args){
        
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        Node ten = new Node(10);
        Node eleven = new Node(11);
        Node twelve = new Node(12);
        Node thirteen = new Node(13);
        Node fourteen = new Node(14);
        Node fifteen = new Node(15);
 
        // set head node
        Node head = one;
 
        // set next pointers
        one.next = four;
        four.next = fourteen;
        fourteen.next = fifteen;
        five.next = nine;
        nine.next = ten;
        seven.next = eight;
        eleven.next = thirteen;
 
        // set down pointers
        one.down = two;
        two.down = three;
        four.down = five;
        five.down = six;
        six.down = seven;
        ten.down = eleven;
        eleven.down = twelve;

        System.out.println("printlist before flattening");
        printList(head);
        System.out.println();
        System.out.println("list after flattening");
        printFlattenedList(flattenList(head));
    }
}
