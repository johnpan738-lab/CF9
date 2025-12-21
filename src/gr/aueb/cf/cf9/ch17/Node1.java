package gr.aueb.cf.cf9.ch17.doubly_linked_list;

public class Node1<T> {
    private T item;
    private Node1<T> prev;
    private Node1<T> next;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Node1<T> getPrev() {
        return prev;
    }

    public void setPrev(Node1<T> prev) {
        this.prev = prev;
    }

    public Node1<T> getNext() {
        return next;
    }

    public void setNext(Node1<T> next) {
        this.next = next;
    }
}