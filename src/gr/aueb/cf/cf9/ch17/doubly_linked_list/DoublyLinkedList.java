package gr.aueb.cf.cf9.ch17.doubly_linked_list;

public class DoublyLinkedList<T> {
    private gr.aueb.cf.cf9.ch17.doubly_linked_list.Node1<T> head = null;
    private gr.aueb.cf.cf9.ch17.doubly_linked_list.Node1<T> tail = null;

    public void insertFirst(T t) {
        gr.aueb.cf.cf9.ch17.doubly_linked_list.Node1<T> tmp = new gr.aueb.cf.cf9.ch17.doubly_linked_list.Node1<>();
        tmp.setItem(t);
        tmp.setNext(head);
        tmp.setPrev(null);

        if (isEmpty()) tail = tmp;
        else head.setPrev(tmp);

        head = tmp;
    }

    /**
     * Time complexity O(1)
     * @param t
     */
    public void insertLast(T t) {
        if (isEmpty()) {
            insertFirst(t);
            return;
        }

        gr.aueb.cf.cf9.ch17.doubly_linked_list.Node1<T> tmp = new gr.aueb.cf.cf9.ch17.doubly_linked_list.Node1<>();
        tmp.setItem(t);
        tmp.setNext(null);
        tmp.setPrev(tail);

        tail.setNext(tmp);
        tail = tmp;
    }

    /**
     * Time complexity O(1).
     * @return
     */
    public gr.aueb.cf.cf9.ch17.doubly_linked_list.Node1<T> removeFirst() {
        if (isEmpty()) return null;
        gr.aueb.cf.cf9.ch17.doubly_linked_list.Node1<T> nodeToReturn = head;
        if (head.getNext() == null) tail = null;
        head = head.getNext();
        if (head != null) head.setPrev(null);
        return nodeToReturn;
    }

    /**
     * Time complexity O(1).
     * @return
     */
    public gr.aueb.cf.cf9.ch17.doubly_linked_list.Node1<T> removeLast() {
        if (isEmpty() || head.getNext() == null)
            return removeFirst();

        gr.aueb.cf.cf9.ch17.doubly_linked_list.Node1<T> nodeToReturn = tail;
        tail = tail.getPrev();
        tail.setNext(null);
        return nodeToReturn;
    }

    public gr.aueb.cf.cf9.ch17.doubly_linked_list.Node1<T> get(T t) {
        gr.aueb.cf.cf9.ch17.doubly_linked_list.Node1<T> nodeToReturn = null;

        for (gr.aueb.cf.cf9.ch17.doubly_linked_list.Node1<T> n = head; n != null; n = n.getNext()) {
            if (n.getItem().equals(t)) {        // equals should have been overriden in T
                nodeToReturn = n;
                break;
            }
        }
        return nodeToReturn;
    }

    public void traverse() {
        for (gr.aueb.cf.cf9.ch17.doubly_linked_list.Node1<T> n = head; n != null; n = n.getNext()) {
            System.out.println(n.getItem());
        }
    }

    public void traverseReverse() {
        for (gr.aueb.cf.cf9.ch17.doubly_linked_list.Node1<T> n = tail; n != null; n = n.getPrev()) {
            System.out.println(n.getItem());
        }
    }


    public int size() {
        int counter = 0;
        for (gr.aueb.cf.cf9.ch17.doubly_linked_list.Node1<T> n = head; n != null; n = n.getNext()) {
            counter++;
        }
        return counter;
    }


    public boolean isEmpty() {
        return head == null;
    }


}
