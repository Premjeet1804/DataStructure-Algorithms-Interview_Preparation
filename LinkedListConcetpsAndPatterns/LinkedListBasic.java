package LinkedListConcetpsAndPatterns;

public class LinkedListBasic {
    static class Node {
        int val;
        Node next;
        Node(int data)
        {
            this.val = data;
        }
    }
    public static void main(String[] args) {
      arrayToLinkedList(new int[]{1,2,3,4,5});


    }
    public static Node arrayToLinkedList(int []arr)
    {
        Node head = new Node(arr[0]);
        Node temp = head;
        int i=1;
        while(i<arr.length)
        {
            temp.next = new Node(arr[i]);
            temp = temp.next;
            i++;
        }
        printLinkedList(head);
        return head;
    }
    public static Node addNodeToLinkedList(Node head)
    {

        return  head;
    }
    public static Node deleteNodeInLinkedList(Node head,int val)
    {
        if(head.val == val) return head.next;

        Node prev = head;
        Node curr = head.next;
        return curr;
    }
    public static void printLinkedList(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.val+"->");
            temp = temp.next;
        }

    }

}
