# `java.io` 
Package (Traditional I/O API):
This package offers fundamental classes for stream-based input and output operations.

## `java.io.File` 
***File Class***: Represents a file or directory path. It provides methods to `create`, `delete`, `rename`, `check existence,` and `retrieve information` about files and directories.
```java
    import java.io.File;

    File myFile = new File("example.txt");
    if (myFile.createNewFile()) {
        System.out.println("File created: " + myFile.getName());
    } else {
        System.out.println("File already exists.");
    }
```

```ad-important
File class does not handle the actual contents of the file.
- To read or write the contents, we use I/O Streams.
  Read more - [[Java IO Streams]].
```
## Create File
```java
import java.io.File;       // Import the File class
import java.io.IOException; // Import IOException to handle errors

public class CreateFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt"); // Create File object
      if (myObj.createNewFile()) {           // Try to create the file
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace(); // Print error details
    }
  }
}
```

#### Create a File in a Specific Folder

To create a file in a specific directory (requires permission), specify the path of the file and use double backslashes to escape the "`\`" character (for Windows). On Mac and Linux you can just write the path, like: /Users/name/filename.txt
### Example
For Linux
```java
File myObj = new File(" /Users/name/filename.txt");
```

## Write To File
Use FileWriter
```java
try {
      FileWriter myWriter = new FileWriter("filename.txt");
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      myWriter.close();  // must close manually
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
```
#### Write To a File with try-with-resources

Since Java 7, you can use [**try-with-resources**](https://www.w3schools.com/java/java_try_catch_resources.asp). This makes sure the writer is closed automatically, even if an error occurs:

### Example

```java
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
  public static void main(String[] args) {
    // FileWrite---r will be closed automatically here
    try (FileWriter myWriter = new FileWriter("filename.txt")) {
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
```

#### Append to a File

Normally, `FileWriter` will **overwrite** a file if it already exists. If you want to **add new content** at the end of the file (without deleting what's already there), you can use the two-argument constructor and pass `true` as the second parameter. This puts the writer into **append mode**:

### Example

```java
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
  public static void main(String[] args) {
    // true = append mode
    try (FileWriter myWriter = new FileWriter("filename.txt", true)) {
      myWriter.write("\nAppended text!");
      System.out.println("Successfully appended to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
```
#### Other Ways to Write to Files

There are several classes you can use to write files in Java:

- `FileWriter` - easiest choice for **basic text**.
- `BufferedWriter` - better for **large text files**, because it is faster and supports handy features.
- `FileOutputStream` - best for **binary data** (images, audio, PDFs)

## Read File
```java
import java.io.File;                  // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner;             // Import the Scanner class to read text files

public class ReadFile {
  public static void main(String[] args) {
    File myObj = new File("filename.txt");

    // try-with-resources: Scanner will be closed automatically
    try (Scanner myReader = new Scanner(myObj)) {
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
```
**Explanation:** This program opens the file named `filename.txt` and reads it line by line using a `Scanner`. Each line is printed to the console. If the file cannot be found, the program will print `"An error occurred."` instead.
#### Get File Information
To get more information about a file, use any of the `File` methods:
### Example

```java
import java.io.File;  // Import the File class

public class GetFileInfo {   public static void main(String[] args) {
    File myObj = new File("filename.txt");
    if (myObj.exists()) {
      System.out.println("File name: " + myObj.getName());
      System.out.println("Absolute path: " + myObj.getAbsolutePath());
      System.out.println("Writeable: " + myObj.canWrite());
      System.out.println("Readable " + myObj.canRead());
      System.out.println("File size in bytes " + myObj.length());
    } else {
      System.out.println("The file does not exist.");
    }
  }
}
```

#### Other Ways to Read Files

There are several classes you can use to read files in Java:

- `Scanner` - best for **simple text** and when you want to parse numbers or words easily.
- `BufferedReader` - best for **large text files**, because it is faster and reads line by line.
- `FileInputStream` - best for **binary data** (images, audio, PDFs) or when you need full control of raw bytes.

#### List all files in a folder
```java
public static void listFilesForFolder(final File folder){  
    for (final File fileEntry : folder.listFiles()) {  
        if (fileEntry.isDirectory()) {  
            listFilesForFolder(fileEntry);  
        } else {  
            System.out.println(fileEntry.getName());  
        }  
    }  
}
final File folder = new File("src");  
FileHandling.listFilesForFolder(folder);

```
Output
```bash
ArraysProblem.java
Main.java
MathsForDSA.java
DP.java
FileHandling.java
SubArrayPrint.java
String.java

```
## Delete File
To delete a file in Java, use the `delete()` method:

```java
import java.io.File;  // Import the File class

public class DeleteFile {
  public static void main(String[] args) { 
    File myObj = new File("filename.txt"); 
    if (myObj.delete()) { 
      System.out.println("Deleted the file: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the file.");
    } 
  } 
}
```
#### Delete a Folder
You can also delete a folder. However, it must be empty:
### Example

```java
import java.io.File; 

public class DeleteFolder {
  public static void main(String[] args) { 
    File myObj = new File("C:\\Users\\MyName\\Test"); 
    if (myObj.delete()) { 
      System.out.println("Deleted the folder: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the folder.");
    } 
  } 
```
