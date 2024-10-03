

public class leetcode1381 {
    int[] stack;
    int top = -1;
    int maxSize;

    public leetcode1381(int maxSize) {
        this.stack = new int[maxSize];
        this.maxSize = maxSize;
    }

    public void push(int x) {
        if (top < maxSize - 1) {
            top++;
            stack[top] = x;
        }
    }

    public int pop() {
        if (top == -1) {
            return -1;
        } else {
            int result = stack[top];
            top--;
            return result;
        }
    }

    public void increment(int k, int val) {
        for (int i = 0; i < Math.min(k, top + 1); i++) {
            stack[i] += val;
        }
    }

}
