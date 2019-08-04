package datastructure.queue;

public class BasicQueue<Y> {
    private Y[] data;
    private int front;
    private int end;

    public BasicQueue() {
        this(1000);
    }

    public BasicQueue(int size) {
        data = (Y[]) new Object[size];
        front = -1;
        end = -1;
    }

    public int size() {
        if (front == -1 && end == -1) {
            return 0;
        }
        return (end - front) + 1;
    }

    public void enQueue(Y item) {
        if ((end + 1) % data.length == front) {
            throw new IllegalArgumentException("Queue is full");
        } else if (size() == 0) {
            front++;
            end++;
            data[end] = item;
        } else {
            end++;
            data[end] = item;
        }
    }

    public Y deQueue() {
        Y ele = null;
        if (size() == 0) {
            throw new IllegalStateException("Can't dequeue becasue not item found");
        } else if (front == end) {
            ele = data[front];
            data[front] = null;
            front = -1;
            end = -1;
        } else {
            ele = data[front];
            data[front] = null;
            front++;
        }
        return ele;
    }

    public boolean contains(Y item) {
        boolean isItemFound = false;
        if(size() == 0){
            return isItemFound;
        }

        for (int i = front; i < end; i++) {
            if (data[i].equals(item)) {
                isItemFound = true;
                break;
            }
        }
        return isItemFound;
    }

    public Y access(int position){
        if(size() == 0){
            throw new IllegalArgumentException("no Iten found becasue queue is empty");
        }

        int trueIndex = 0;
        for(int i = front; i < end; i++ ){
            if(trueIndex == position){
                return data[i];
            }
            trueIndex++;
        }

        throw new IllegalArgumentException("No item found on the given position");
    }
}
