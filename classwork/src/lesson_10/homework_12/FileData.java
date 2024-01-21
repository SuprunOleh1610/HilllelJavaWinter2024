package lesson_10.homework_12;

public class FileData {
    private String name;
    private long sizeInBytes;
    private String path;

    public FileData(String name, long sizeInBytes, String path) {
        this.name = name;
        this.sizeInBytes = sizeInBytes;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public long getSizeInBytes() {
        return sizeInBytes;
    }

    public String getPath() {
        return path;
    }
}
