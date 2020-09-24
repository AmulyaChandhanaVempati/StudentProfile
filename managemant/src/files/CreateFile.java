package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {  
  public static void main(String[] args) {  
    try {  
      FileWriter myObj = new FileWriter("filename.txt");  
      myObj.write("Hi this is a project file");
      myObj.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();  
    }  
  }  
} 