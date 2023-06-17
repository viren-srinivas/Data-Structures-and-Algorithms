package LinkedList;

public class SinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue)
    {
        //head=new Node();
        Node node=new Node();//O(1)
        node.next=null;//O(1)
        node.value=nodeValue;//O(1)
        head=node;//O(1)
        tail=node;//O(1)
        size=1;//O(1)
        return head;
    }

    public static void main(String[] args) {

        SinglyLinkedList sLL=new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        System.out.println(sLL.head.value);
    }

}
