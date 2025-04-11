package java_adv2.io.file;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public class NewFilesMain {

  public static void main(String[] args) throws IOException {
    Path file = Path.of("temp/example.txt");
    Path directory = Path.of("temp/exampleDir");

    System.out.println("file exists() = " + Files.exists(file));

    try {
      Files.createFile(file);
      System.out.println("file created");
    } catch (FileAlreadyExistsException e) {
      System.out.println(file + " already exists");
    }

    try {
      Files.createDirectory(directory);
    } catch (FileAlreadyExistsException e) {
      System.out.println(directory + " already exists");

    }

//    Files.delete(file);
//    System.out.println("file deleted");

    System.out.println("Is regular file:  " + Files.isRegularFile(file));
    System.out.println("Is directory:  " + Files.isDirectory(directory));
    System.out.println("File name:  " + file.getFileName());
    System.out.println("File size: " + Files.size(file));
    System.out.println("Directory name: " + directory.getFileName());

    Path newFile = Path.of("temp/newExample.txt");
    Files.move(file, newFile, StandardCopyOption.REPLACE_EXISTING);
    System.out.println("File moved/renamed");

    System.out.println("Last modified: " + Files.getLastModifiedTime(newFile));

    BasicFileAttributes attrs = Files.readAttributes(newFile, BasicFileAttributes.class);
    System.out.println("==== Attributes ===");
    System.out.println("Creation time: " + attrs.creationTime());
    System.out.println("Is directory time: " + attrs.isDirectory());
    System.out.println("Is regular time: " + attrs.isRegularFile());
    System.out.println("isSymbolicLink time: " + attrs.isSymbolicLink());
    System.out.println("size: " + attrs.size());

  }

}
