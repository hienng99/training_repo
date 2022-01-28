package exception.checked;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            FileReader fr = new FileReader("D:\\tma\\is_tex.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null)
                out.println(line);
            br.close();
        } catch (FileNotFoundException e) {
            out.println(e);
//            throw e;
        } catch (IOException e) {
            out.println(e);
//            throw e;
        }
    }
}
