package datastructure.stack;

public class BasicStack<X> {

    private X[] data;
    private int stackPointer;

    public BasicStack() {
        data = (X[]) new Object[1000];
        stackPointer = 0;
    }

    public void push(X item) {
        data[stackPointer++] = item;
    }

    public X pop() {
        if (stackPointer == 0) {
            throw new IllegalArgumentException("No data found on stack");
        }
        return data[--stackPointer];
    }

    public int size() {
        return stackPointer;
    }

    public boolean contains(X item) {
        boolean isItemPresent = false;
        for (int i = 0; i < stackPointer; i++) {
            if (data[i].equals(item)) {
                isItemPresent = true;
                break;
            }
        }
        return isItemPresent;
    }

    public X access(X item) {
        while (stackPointer > 0) {
            X ele = pop();
            if (ele.equals(item)) {
                return ele;
            }
        }
        throw new IllegalArgumentException("data not found in stack");
    }
}
