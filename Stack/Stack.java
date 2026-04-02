public class Stack {

        private int[] arr;
        private int top;
        private int capacity;
        private int minCapacity = 10;

        // Constructor to initialize the stack
        public Stack(int size) {

            arr = new int[size];
            capacity = size;
            top = -1;
        }

        // Add an element to the stack
        public void resize() {
            int[] newArr = new int[capacity * 2];
            for (int i = 0; i < capacity; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
            capacity *= 2;
        }
    private void shrink() {
        int newCapacity = capacity / 2;
        if (newCapacity <minCapacity) return; // never shrink below initial size
        capacity = newCapacity;
        int[] newArr = new int[capacity];
        for (int i = 0; i <= top; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        }
        public void push(int x) {
            if (isFull()) {
                resize();
                return;
            }
            arr[++top] = x;
            System.out.println("Pushed: " + x);
        }

        // Remove the top element
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow!");
                return -1;
            }
            return arr[top--];
        }

        // Return the top element without removing it
        public int peek() {
            if (!isEmpty()) {
                return arr[top];
            }
            return -1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }

    public static void main(String[] args) {
        Stack stack = new Stack(10);

        stack.push(1);
        stack.push(2);
        stack.push(3); // This will trigger a resize

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Top element after pop is: " + stack.peek());
    }

    }
