package lesson_07.homework_09;

import java.util.Arrays;

public class DynamicStringArray {
    private static final int DEFAULT_CAPACITY = 10;
    private String[] array;
    private int index;

    public DynamicStringArray() {
        this.array = new String[DEFAULT_CAPACITY];
        this.index = 0;
    }

    public boolean add(int index, String value) {
        ensureCapacity();

        System.arraycopy(array, index, array, index + 1, this.index - index);//Shift to the right

        array[index] = value;
        this.index++;
        return true;
    }

    public boolean add(String value) {
        ensureCapacity();

        array[index] = value;
        index++;
        return true;
    }

    public boolean delete(int index) {
        System.arraycopy(array, index + 1, array, index, this.index - index - 1);//Shift to the left

        array[this.index - 1] = null;
        this.index--;
        return true;
    }

    public boolean delete(String value) {
        for (int i = 0; i < index; i++) {
            if (value.equals(array[i])) {
                delete(i);
                return true;
            }
        }
        return false;
    }

    public String get(int index) {
        return array[index];
    }

    private void ensureCapacity() {
        if (index == array.length) {
            int newCapacity = array.length * 2;
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    public void showAllItems() {
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DynamicStringArray dynamicArray = new DynamicStringArray();
        dynamicArray.add("First");
        dynamicArray.add("Second");
        dynamicArray.add("Third");
        dynamicArray.showAllItems();

        System.out.println("------------");

        dynamicArray.add(2, "Insert");
        dynamicArray.showAllItems();

        System.out.println("------------");

        dynamicArray.delete(2);
        dynamicArray.showAllItems();

        System.out.println("------------");

        dynamicArray.delete("Insert");
        dynamicArray.showAllItems();

        System.out.println("------------");

        System.out.println("Index 1: " + dynamicArray.get(1));
    }
}
