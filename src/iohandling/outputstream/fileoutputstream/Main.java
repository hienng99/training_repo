package iohandling.outputstream.fileoutputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        String path = "D:\\tma\\os_text.txt";
        try (OutputStream fos = new FileOutputStream(path)) {
            String s = "I am a student at CTU";
            byte[] b = s.getBytes();
            fos.write(b);
            fos.flush();
            System.out.println("Done!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
