import java.util.NoSuchElementException;

public class SinglyLinkedStack<T> implements CSE214Stack<T>{
    private SinglyLinkedList<T> stack;

    public SinglyLinkedList<T> getStack() {
        return stack;
    }

    public void setStack(SinglyLinkedList<T> stack) {
        this.stack = stack;
    }

    public SinglyLinkedStack(){

        this.stack = new SinglyLinkedList<T>();
    }
    public SinglyLinkedStack(T... elements){
        this();
        for(int i = 0; i < elements.length; i++){
            stack.add(elements[i]);
        }
    }
    public int size() {

        return stack.size();
    }


    public T peek() {
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        return stack.getHead().getElement();
    }

    public T pop() {
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        return stack.remove(0);
    }

    public void push(T elem) {
        stack.add(elem);
    }

    public boolean isEmpty() {
        return stack.getHead() == null;
    }


}
