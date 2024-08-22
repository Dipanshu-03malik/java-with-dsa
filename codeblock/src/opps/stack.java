package opps;
public class stack {
    private int maxSize; 
    private int[] stackArray;
    private int top; 

    public stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack is full. Unable to push " + value);
        }
    }

    public int pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty. Unable to pop.");
            return -1; 
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1; 
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        stack myStack = new stack(5);
        
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.push(60); 

        System.out.println("Top of stack: " + myStack.peek());
        
        while (!myStack.isEmpty()) {
            int value = myStack.pop();
            System.out.println("Popped: " + value);
        }

        myStack.pop(); 
    }
}

