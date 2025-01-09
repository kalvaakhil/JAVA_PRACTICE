class CustomStack {
    private int arr[];
    private int top;
    private int capacity;

    // Constructor
    public CustomStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Push operation
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Peek operation
    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Size of the stack
    public int size() {
        return top + 1;
    }
}

public class CustomStackDemo {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack size: " + stack.size()); // Output: 3
        System.out.println("Top element: " + stack.peek()); // Output: 30

        stack.pop();
        System.out.println("Stack size after pop: " + stack.size()); // Output: 2
    }
}
