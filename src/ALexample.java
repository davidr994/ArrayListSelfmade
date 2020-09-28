import java.util.Arrays;

public class ALexample<E> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public ALexample() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("index");
        }
        return (E) elements[index];
    }

    public E remove(int index) {
        E removeItem = (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[index] = elements[i + 1];
        }
        size--;
        return removeItem;
    }


}
