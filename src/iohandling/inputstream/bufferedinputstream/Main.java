package iohandling.inputstream.bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        String path = "D:\\tma\\is_text.txt";
        try (InputStream fis = new FileInputStream(path);
             InputStream bis = new BufferedInputStream(fis)) {
////            int ch;
////            while ((ch = bis.read()) != -1) {
////                System.out.print((char) ch);
////            }
//
//            int rem_byte = bis.available();
//            System.out.println(rem_byte);
//            byte[] byteArr = new byte[rem_byte];
//            bis.read(byteArr, 0, rem_byte);
//            for (byte b : byteArr) {
//                System.out.print((char) b);
//            }

            byte[] b1 = new byte[7];
            bis.read(b1);
            bis.mark(b1.length);
            for (byte b : b1) {
                System.out.print((char) b);
            }

            System.out.println();

            byte[] b2 = new byte[12];
            bis.read(b2);
            for (byte b : b2) {
                System.out.print((char) b);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
