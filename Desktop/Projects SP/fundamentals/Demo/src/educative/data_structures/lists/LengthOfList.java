package educative.data_structures.lists;

public class LengthOfList {

    Node head;

    class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    private void push (int ele) {
        Node newNode = new Node(ele);
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            } last.next = newNode;
        }
    }

    private int listLength(Node node) {
        if (node == null)
            return 0;
        return 1 + listLength(node.next);
    }

    public static void main(String[] args) {
        LengthOfList list = new LengthOfList();
        list.push(1);
        list.push(3);
        list.push(1);
        list.push(2);
        list.push(1);
        LengthOfList lengthOfList = new LengthOfList();
        System.out.println(lengthOfList.listLength(list.head));
    }
}
