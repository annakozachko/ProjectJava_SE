package input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class DemoInputStream {
    public static void main(String[] args) {
        try {

            FileInputStream fis = new FileInputStream("data/in.txt");
            int read = fis.read();
            System.out.println((char) read);

            byte[] bytes = new byte[10];
            int len = fis.read(bytes);

            System.out.println(len);
            System.out.println(Arrays.toString(bytes));
            for (byte aByte : bytes) {
                System.out.println((char) aByte + " ");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
