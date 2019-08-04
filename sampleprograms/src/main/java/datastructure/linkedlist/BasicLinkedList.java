package datastructure.linkedlist;

public class BasicLinkedList<X> {
    private Node first;
    private Node last;
    private int nodeCount;

    public BasicLinkedList() {
        last = null;
        first = null;
        nodeCount = 0;
    }

    public int size() {
        return nodeCount;
    }

    public void add(X nodeItem) {

        if (first == null) {
            first = new Node(nodeItem);
            last = first;
        } else {                //  we want to grab the last node and update its value
            Node newLastNode = new Node(nodeItem);
            last.setNextNode(newLastNode);
            last = newLastNode;
        }
        nodeCount++;
    }

    public void insert(X item, int position) {
        if (size() < position) {
            throw new IllegalArgumentException("List is smaller than the position");
        }

        Node currentNode = first;
        for (int i = 1; i < position && currentNode != null; i++) {
            currentNode = currentNode.getNextNode();
        }

        Node newNode = new Node(item);
        Node nextNode = currentNode.getNextNode();
        currentNode.setNextNode(newNode);
        newNode.setNextNode(nextNode);
        nodeCount++;
    }

    public X removeAt(int position) {

        if (first == null) {
            throw new IllegalStateException("List is empty and no items to remove");
        }

        Node currentNode = first;
        Node previousNode = first;
        for (int i = 0; i < position && currentNode != null; i++) {
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }

        X removeItem = currentNode.getNodeItem();
        previousNode.setNextNode(currentNode.getNextNode());
        nodeCount--;
        return removeItem;


    }

    public X remove() {
        if (first == null) {
            throw new IllegalStateException("The list is empty");
        }

        X node = first.getNodeItem();
        first = first.getNextNode();
        nodeCount--;
        return node;
    }

    public X get(int position) {

        if (first == null) {
            throw new IllegalStateException("List is empty");
        }

        Node currentNode = first;
        for (int i = 1; i < size() && currentNode != null; i++) {
            if (position == i) {
                return currentNode.getNodeItem();
            }

            currentNode = currentNode.getNextNode();
        }

        return null;
    }

    public int find(X item) {
        if (first == null) {
            throw new IllegalStateException("List is Empty");
        }

        Node currentNode = first;
        for (int i = 1; i < size() && currentNode != null; i++) {
            if (currentNode.getNodeItem().equals(item)) {
                return i;
            }
            currentNode = currentNode.getNextNode();
        }
        return -1;
    }

    @Override
    public String toString(){
        StringBuffer contents = new StringBuffer();
        Node currNode = first;

        while(currNode != null){
            contents.append(currNode.getNodeItem());
            currNode = currNode.getNextNode();

            if(currNode != null){
                contents.append(", ");
            }
        }
        return contents.toString();
    }

    private class Node {
        private X nodeItem;
        private Node nextNode;

        public Node(X item) {
            this.nextNode = null;
            this.nodeItem = item;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public X getNodeItem() {
            return nodeItem;
        }

    }

}
