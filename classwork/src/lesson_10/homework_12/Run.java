package lesson_10.homework_12;

import java.util.List;

public class Run {

    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator("/path/to/file");

        fileNavigator.add(new FileData("files.txt", 1024, "/path/to/file"));
        fileNavigator.add(new FileData("helloWorld.java", 4096, "/path/to/file"));
        fileNavigator.add(new FileData("firstApp.java", 2048, "/path/to/file"));

        fileNavigator.add(new FileData("example.txt", 512, "/another/path"));

        fileNavigator.add(new FileData("example.txt", 512, "/path/to/file"));

        System.out.println("--------------");

        System.out.println("Sort by size:");
        for (FileData fileData : fileNavigator.sortBySize()) {
            System.out.println(fileData.getName() + " - " + fileData.getSizeInBytes() + " bytes");
        }

        System.out.println("--------------");

        System.out.println("Find by path '/path/to/file':");
        List<FileData> foundFiles = fileNavigator.find("/path/to/file");
        for (FileData fileData : foundFiles) {
            System.out.println(fileData.getName() + " - " + fileData.getSizeInBytes() + " bytes");
        }

        System.out.print("--------------");

        System.out.println("\nFilter by size (max 1500 bytes):");
        List<FileData> filteredFiles = fileNavigator.filterBySize(1500);
        for (FileData fileData : filteredFiles) {
            System.out.println(fileData.getName() + " - " + fileData.getSizeInBytes() + " bytes");
        }

        System.out.print("--------------");

        System.out.println("\nRemove path '/path/to/file':");
        fileNavigator.remove("/path/to/file");
        System.out.println("Files after removal:");

        fileNavigator.printFileMap();
    }
}

