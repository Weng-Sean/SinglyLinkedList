import java.util.NoSuchElementException;

public class SinglyLinkedList<T> implements CSE214List<T>{
    class Node{
        private T element;
        private Node next;
        Node(){
        }
        Node(T element){
            this.element = element;
        }

        public T getElement() {
            return element;
        }

        public Node getNext() {
            return next;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public SinglyLinkedList(){
        head = null;
    }

    public SinglyLinkedList(T... elements){
        head = new Node(elements[0]);
        Node iterator = head;
        for (int i = 1; i < elements.length; i++){
            iterator.next = new Node(elements[i]);
            iterator = iterator.next;
        }

    }

    public int size() {
        if(head.element == null && head.next == null)
            return 0;
        int size = 0;
        Node iterator = head;
        while (iterator != null){
            size++;
            iterator = iterator.next;
        }
        return size;
    }


    public void add(T elem, int index) {
        if(index > size())
            throw new IndexOutOfBoundsException();
        if(index == 0){
            add(elem);
            return;
        }
        Node iterator = head;
        for(int i = 0; i < index-1; i++){
            iterator = iterator.next;
        }
        Node temp = new Node(elem);
        temp.next = iterator.next;
        iterator.next = temp;
    }


    public void add(T elem) {
        Node temp = new Node(elem);
        temp.next = head;
        head = temp;
    }


    public T remove(int index) {
        Node iterator = head;
        if (index >= size()){
            throw new IndexOutOfBoundsException();
        }
        if (index == 0){
            Node temp = head;
            head = head.next;
            return temp.element;
        }
        for (int i = 0; i < index-1; i++){
            iterator = iterator.next;
        }
        Node temp = iterator.next;
        iterator.next = iterator.next.next;
        return temp.element;
    }


    public void remove(T elem) {
        Node iterator = head;
        if (head.element.equals(elem)){
            remove(0);
            return;
        }
        while(iterator.next != null && iterator.next.element != elem){
            iterator = iterator.next;
        }
        if (iterator.next == null){
            throw new NoSuchElementException();
        }
        else{
            iterator.next = iterator.next.next;
        }
    }


    public boolean find(T elem) {
        Node iterator = head;
        while (iterator != null && iterator.element != elem)
            iterator = iterator.next;
        if(iterator == null)
            return false;
        else
            return true;
    }


}
