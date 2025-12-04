import java.util.*;

class CircularBuffer {
    private int[] buffer;
    private int head = 0; // next write
    private int size = 0;

    public CircularBuffer(int capacity) {
        buffer = new int[capacity];
    }

    public void add(int value) {
        buffer[head] = value;
        head = (head + 1) % buffer.length;
        if (size < buffer.length) {
            size++;
        }
    }

    public List<Integer> getElements() {
        List<Integer> result = new ArrayList<>();
        int start = (head - size + buffer.length) % buffer.length;
        for (int i = 0; i < size; i++) {
            result.add(buffer[(start + i) % buffer.length]);
        }
        return result;
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.add(1);
        cb.add(2);
        cb.add(3);
        System.out.println(cb.getElements());
        cb.add(4);
        System.out.println(cb.getElements()); // [2,3,4]
    }
}
