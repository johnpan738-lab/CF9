package gr.aueb.cf.cf9.ch17.doubly_linked_list;

public class Node<T> {
    private T item;
    private gr.aueb.cf.cf9.ch17.doubly_linked_list.Node1<T> prev;
    private gr.aueb.cf.cf9.ch17.doubly_linked_list.Node1<T> next;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public gr.aueb.cf.cf9.ch17.doubly_linked_list.Node1<T> getPrev() {
        return prev;
    }

    public void setPrev(gr.aueb.cf.cf9.ch17.doubly_linked_list.Node1<T> prev) {
        this.prev = prev;
    }

    public gr.aueb.cf.cf9.ch17.doubly_linked_list.Node1<T> getNext() {
        return next;
    }

    public void setNext(gr.aueb.cf.cf9.ch17.doubly_linked_list.Node1<T> next) {
        this.next = next;
    }
}
