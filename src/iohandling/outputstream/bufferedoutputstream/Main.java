package iohandling.outputstream.bufferedoutputstream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        String path = "D:\\tma\\os_text.txt";
        try (OutputStream fos = new FileOutputStream(path);
            OutputStream bos = new BufferedOutputStream(fos)) {
            String s = "Today is the first day I go to school.";
            byte[] b = s.getBytes();
            bos.write(b, 2, 5);
            System.out.println("Done!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
