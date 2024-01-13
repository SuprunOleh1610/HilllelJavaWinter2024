package lesson_09.homework_11;

import java.util.*;

public class CollectionsAndLists {

    private static final String[] stringsArray = {"bird", "fox", "bird", "cat", "dog", "cat", "bird", "fox", "cat", "bird", "dog"};
    private static final Integer[] integerArray = {1, 2, 3, 1, 2, 3, 4, 5};

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList(stringsArray);

        String searchString = "bird";
        System.out.println("Occurrences of '" + searchString + "': " + countOccurrence(stringList, searchString));

        List<Integer> integerList = toList(integerArray);
        System.out.println("List from array: " + integerList);

        List<Integer> integerListGeneric = toListGeneric(integerArray);
        System.out.println("List from array (using Generic): " + integerListGeneric);

        List<Integer> uniqueNumbers = findUnique(integerList);
        System.out.println("Unique numbers: " + uniqueNumbers);

        calcOccurrence(stringList);

        List<WordOccurrence> occurrences = findOccurrence(stringList);
        System.out.println("Occurrences: " + occurrences);
    }

    private static int countOccurrence(List<String> stringList, String searchString) {
        int count = 0;
        for (String str : stringList) {
            if (str.equals(searchString)) {
                count++;
            }
        }
        return count;
    }

    private static List<Integer> toList(Integer[] array) {
        List<Integer> list = new ArrayList<>();
        for (Integer element : array) {   //Collections.addAll(list, array);
            list.add(element);
        }
        return list;
    }

    private static <T> List<T> toListGeneric(T[] array) {
        return Arrays.asList(array);
    }

    private static List<Integer> findUnique(List<Integer> numbers) {
        return new ArrayList<>(new HashSet<>(numbers));
    }

    private static void calcOccurrence(List<String> stringList) {
        Map<String, Integer> occurrenceMap = new HashMap<>();
        for (String word : stringList) {
            occurrenceMap.put(word, occurrenceMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : occurrenceMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static class WordOccurrence {
        String word;
        int occurrence;

        public WordOccurrence(String name, int occurrence) {
            this.word = name;
            this.occurrence = occurrence;
        }

        @Override
        public String toString() {
            return "{word: \"" + word + "\", occurrence: " + occurrence + "}";
        }
    }

    private static List<WordOccurrence> findOccurrence(List<String> stringList) {
        Map<String, Integer> occurrenceMap = new HashMap<>();
        for (String word : stringList) {
            occurrenceMap.put(word, occurrenceMap.getOrDefault(word, 0) + 1);
        }

        List<WordOccurrence> occurrences = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : occurrenceMap.entrySet()) {
            occurrences.add(new WordOccurrence(entry.getKey(), entry.getValue()));
        }

        return occurrences;
    }
}
