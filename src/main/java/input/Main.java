package input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("data/java.png");
             FileOutputStream fos = new FileOutputStream("data/newjava.png")){

          byte[] bytes = new byte[fis.available()];
            fis.read(bytes);
           fos.write(bytes);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
