package lesson_09.homework_11.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Record> records;

    public PhoneBook() {
        this.records = new ArrayList<>();
    }

    public void addRecord(Record record) {
        records.add(record);
    }

    public List<Record> find(String name) {
        List<Record> foundRecord = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equals(name)) {
                foundRecord.add(record);
                return foundRecord;
            }
        }
        return foundRecord;
    }

    public List<Record> findAll(String name) {
        List<Record> foundRecords = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equals(name)) {
                foundRecords.add(record);
            }
        }
        return foundRecords;
    }
}

