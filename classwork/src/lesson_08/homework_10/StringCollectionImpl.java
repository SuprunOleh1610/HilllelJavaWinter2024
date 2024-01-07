package lesson_08.homework_10;

import java.util.Arrays;


public class StringCollectionImpl implements CCollection {
    private static final int INITIAL_CAPACITY = 10;
    private String[] array;
    private int size;


    public StringCollectionImpl() {
        array = new String[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public boolean add(String o) {
        ensureCapacity();
        array[size++] = o;
        return true;
    }

    @Override
    public boolean add(int index, String o) {
        if (index < 0 || index > size) {
            return false;
        }

        ensureCapacity();

        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = o;
        size++;
        return true;
    }

    @Override
    public boolean delete(String o) {
        for (int i = 0; i < size; i++) {
            if (array[i] != null && array[i].equals(o)) {
                System.arraycopy(array, i + 1, array, i, size - i - 1);
                array[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];
    }

    @Override
    public boolean contain(String o) {
        for (int i = 0; i < size; i++) {
            if (array[i] != null && array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(CCollection collection) {
        if (this == collection) {
            return true;
        }

        if (collection == null || size != collection.size()) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (!array[i].equals(collection.get(i))) {
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean clear() {
        array = new String[INITIAL_CAPACITY];
        size = 0;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    public void border() {
        System.out.println("_________");
    }


    public static void main(String[] args) {
        CCollection collection = new StringCollectionImpl();

        collection.add("One");
        collection.add("Two");
        collection.add("Three");


        System.out.println("Size: " + collection.size());

        collection.border();

        System.out.println("Elements: ");
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.get(i));
        }

        collection.border();

        collection.add(1, "New Element");

        System.out.println("Elements after adding at index 1: ");
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.get(i));
        }

        collection.border();

        collection.delete("Two");

        System.out.println("Elements after deleting 'Two': ");
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.get(i));
        }

        collection.border();

        System.out.println("Contains 'One': " + collection.contain("One"));

        collection.border();

        CCollection anotherCollection = new StringCollectionImpl();
        anotherCollection.add("One");
        anotherCollection.add("New Element");
        anotherCollection.add("Three");

        System.out.println("Collections are equal: " + collection.equals(anotherCollection));

        collection.border();

        collection.clear();

        System.out.println("Size after clear: " + collection.size());
    }
}

