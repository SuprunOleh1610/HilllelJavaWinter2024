package lesson_09.homework_11.phonebook;

import java.util.List;

public class Run {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        Record record1 = new Record("John", "099456789");
        Record record2 = new Record("Mary", "055654321");
        Record record3 = new Record("John", "067222333");

        phoneBook.addRecord(record1);
        phoneBook.addRecord(record2);
        phoneBook.addRecord(record3);

        String found = "John";

        System.out.println("Search for the first one found:");
        List<Record> foundRecord = phoneBook.find(found);

        if (foundRecord.isEmpty()) {
            System.out.println("Record not found.");
        } else {
            for (Record record : foundRecord) {
                System.out.println("Found: " + record.getName() + " - " + record.getPhoneNumber());
            }
        }

        System.out.println();

        System.out.println("Find all matches:");

        List<Record> allRecords = phoneBook.findAll(found);

        if (allRecords.isEmpty()) {
            System.out.println("Records not found.");
        } else {
            for (Record record : allRecords) {
                System.out.println("Found: " + record.getName() + " - " + record.getPhoneNumber());
            }
        }
    }
}
