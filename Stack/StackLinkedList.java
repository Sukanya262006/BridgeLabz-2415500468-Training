public class StackLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top;

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;

    }

    void pop() {
        if (top == null) {

            return;
        }
        System.out.println(top.data);
        top = top.next;
    }

    void peek() {
        if (top == null) {

            return;
        }
        System.out.println(top.data);
    }
    void isEmpty() {
        System.out.println(top == null);
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        stack.peek();
    }
}