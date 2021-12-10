package ua.intita.qa.homework18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Music {
    public static void main(String[] args) {
        try (FileInputStream musicIn = new FileInputStream("data/skillet_those_nights-namobilu.com.mp3");
             FileOutputStream musicOut = new FileOutputStream("data/music.mp3") ){
            byte[] bytes = new byte[musicIn.available()];
            musicIn.read(bytes);
            musicOut.write(bytes);
                    } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
