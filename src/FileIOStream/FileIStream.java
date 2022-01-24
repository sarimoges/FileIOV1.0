
package FileIOStream;

import java.io.*;  
public class FileIStream{  
 public static void main(String args[]){  
  try{
      File file=new File("mytx.txt");
    FileInputStream fin=new FileInputStream(file);
    int i=0;  
    while((i=fin.read())!=-1){  
     System.out.print((char)i);  
    }  
    fin.close();  
  }catch(Exception e){
      System.out.println(e);}  
 }  
} 