package lesson_10.homework_12;

import java.util.*;

public class FileNavigator {
    private Map<String, List<FileData>> fileMap;
    private String basePath;

    public FileNavigator(String basePath) {
        this.fileMap = new HashMap<>();
        this.basePath = basePath;
    }

    public void add(FileData fileData) {
        String key = fileData.getPath();

        if (!key.equals(getBasePath(key))) {
            System.out.println("Error, path mismatch: " + key);
            return;
        }

        if (!fileMap.containsKey(key)) {
            fileMap.put(key, new ArrayList<>());
        }

        List<FileData> fileList = fileMap.get(key);
        fileList.add(fileData);
    }

    public List<FileData> find(String path) {
        return fileMap.getOrDefault(path, new ArrayList<>());
    }

    public List<FileData> filterBySize(long maxSize) {
        List<FileData> result = new ArrayList<>();
        for (List<FileData> fileList : fileMap.values()) {
            for (FileData fileData : fileList) {
                if (fileData.getSizeInBytes() <= maxSize) {
                    result.add(fileData);
                }
            }
        }
        return result;
    }

    public void remove(String path) {
        fileMap.remove(path);
    }

    public List<FileData> sortBySize() {
        List<FileData> result = new ArrayList<>();
        for (List<FileData> fileList : fileMap.values()) {
            result.addAll(fileList);
        }
        result.sort(Comparator.comparingLong(FileData::getSizeInBytes));
        return result;
    }

    public void printFileMap() {
        for (Map.Entry<String, List<FileData>> entry : fileMap.entrySet()) {
            String path = entry.getKey();
            List<FileData> fileList = entry.getValue();

            System.out.println("Path: " + path);
            System.out.println("Files:");
            for (FileData fileData : fileList) {
                System.out.println("  " + fileData.getName() + " - " + fileData.getSizeInBytes() + " bytes");
            }
            System.out.println();
        }
    }

    public Map<String, List<FileData>> getFileMap() {
        return fileMap;
    }

    public String getBasePath(String fullPath) {
        return basePath;
    }
}
