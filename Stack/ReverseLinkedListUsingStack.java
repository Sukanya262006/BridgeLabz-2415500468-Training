import java.util.Stack;
public class ReverseLinkedListUsingStack {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void reverse() {
        if (head == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node curr = head;
        while (curr != null) {
            stack.push(curr);
            curr = curr.next;
        }
        head = stack.pop();
        curr = head;
        while (!stack.isEmpty()) {
            curr.next = stack.pop();
            curr = curr.next;
        }
        curr.next = null;

    }
    void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedListUsingStack list = new ReverseLinkedListUsingStack();
        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);
        list.head.next.next.next = list.new Node(4);

        System.out.println("Original List:");
        list.display();

        list.reverse();

        System.out.println("Reversed List:");
        list.display();
    }
}