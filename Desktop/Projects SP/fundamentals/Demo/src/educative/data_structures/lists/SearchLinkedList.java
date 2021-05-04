package educative.data_structures.lists;

public class SearchLinkedList {

    Node head;

    class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    private void push(int ele) {
        Node newNode = new Node(ele);
        newNode.next = null;

        if (head == null)
            head = newNode;
        else {
            Node last = head;
            while (last.next != null)
                last = last.next;
            last.next = newNode;
        }
    }

    public static void main(String[] args) {
        SearchLinkedList list = new SearchLinkedList();
        list.push(1);
        list.push(3);
        list.push(5);
        list.push(8);
        list.push(2);
        list.traverseList();
        System.out .println(searchItem(list.head,1));
    }

    private static boolean searchItem(Node head, int ele) {

        if (head == null)
            return false;
        if (head.data == ele)
            return true;
        return searchItem(head.next, ele);

    }

    private void traverseList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
