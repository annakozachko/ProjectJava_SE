package ua.intita.qa.homework18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Text {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("data/text.txt");
             FileOutputStream fos = new FileOutputStream("data/out_text.txt")){
            byte[] bytes = new byte[fis.available()];
            fis.read(bytes);
            fos.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}