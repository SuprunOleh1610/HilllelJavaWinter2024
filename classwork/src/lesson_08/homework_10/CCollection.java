package lesson_08.homework_10;

public interface CCollection {
    boolean add(String o);

    boolean add(int index, String o);

    boolean delete(String o);

    String get(int index);

    boolean contain(String o);

    boolean equals(CCollection collection);

    boolean clear();

    int size();

    void border();
}
