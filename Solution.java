class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Solution{
    public static Node mergeSortedList(Node first,Node second){
        Node result = null;
        if(first == null){
            return second;
        }
        else if(second == null){
            return first;
        }
        if(first.data <= second.data){
            result = first;
            first.next = mergeSortedList(first.next, second);
        }
        else{
            result = second;
            second.next = mergeSortedList(first, second.next);
        }
        return result;
    }
    public static void main(String[] args) {
        Node first = new Node(2);
        first.next = new Node(4);
        first.next.next = new Node(6);
        
        Node second = new Node(7);
        second.next = new Node(8);
        second.next.next = new Node(9);

        Node merge = mergeSortedList(first, second);
        Node temp = merge;
        System.out.println("Merge Sorted Linked List:\n");
        while(temp != null){
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
    }
}