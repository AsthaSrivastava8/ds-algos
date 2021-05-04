package educative.data_structures.lists;

public class PrintReverseList {

    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    private void push(int ele) {
        Node newNode = new Node(ele);
        newNode.next = null;
        if (head == null) {
            this.head = newNode;

        } else {
            Node last = head;
            while (last.next != null)
                last = last.next;
            last.next = newNode;
        }
    }

    private static void reverse(Node node) {

        if (node == null)
            return;

        reverse(node.next);
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        PrintReverseList list = new PrintReverseList();
        list.push(12);
        list.push(65);
        list.push(55);
        list.push(88);

        reverse(list.head);
    }
}
