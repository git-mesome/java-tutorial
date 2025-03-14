package com.example.java_adv2.io.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class OldFileMain {

  public static void main(String[] args) throws IOException {
    File file = new File("temp/example.txt");
    File directory = new File("temp/exampleDir");

    System.out.println("File exists: " + file.exists());

    boolean created = file.createNewFile();
    System.out.println("File created: " + created);

    boolean dirCreated = directory.mkdir();
    System.out.println("Directory created: " + dirCreated);

//    boolean deleted = file.delete();
//    System.out.println("File deleted: " + deleted);

    System.out.println("Is File: " + file.isFile());
    System.out.println("Is Directory: " + directory.isDirectory());
    System.out.println("file.getName() = " + file.getName());
    System.out.println("file.length() = " + file.length() + "bytes");

    File newFile = new File("temp/newExampleFile.txt");
    boolean renamed = file.renameTo(newFile);
    System.out.println("renamed = " + renamed);

    long lastModified = newFile.lastModified();
    System.out.println("lastModified = " + new Date(lastModified));
  }

}
