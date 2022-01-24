package FileIOStream;

import java.io.*;

public class FileOStream {

    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream(
                    "D:\\Mand\\mytx.txt",false);
            String s = "Be strong ....java is very smart ";
            byte b[] = s.getBytes();//converting string into byte array  
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
