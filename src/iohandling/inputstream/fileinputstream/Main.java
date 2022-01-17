package iohandling.inputstream.fileinputstream;

import java.io.FileInputStream;
import java.io.InputStream;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        String path = "D:\\tma\\is_text.txt";
        try (InputStream fis = new FileInputStream(path)) {
//            int ch;
//            String string = "";
//            while ((ch = fis.read()) != -1) {
//                string += (char) ch;
//                out.println(fis.available() + " byte(s) remaining. String: " + string);
//            }

//            out.println();
//
            byte[] byteArray = new byte[40];
            int numOfByte = fis.read(byteArray);
            out.println("Read " + numOfByte + " byte(s).");
            for (byte b : byteArray) {
                char letter = (char) b;

                    out.print(letter);

            }
        } catch (Exception e) {
            out.println(e);
        }
    }
}
