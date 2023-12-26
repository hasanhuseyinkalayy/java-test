package practice_5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Streams2 {
    /**
     *
     */
    public static void main(String[] args) {
        try {
            byte bwrite[] = { 1, 2, 3, 4, 5 };
            OutputStream os = new FileOutputStream("text.txt");
            for (int x = 0; x < bwrite.length; x++) {
                os.write(bwrite[x]);
            }
            os.close();

            InputStream is = new FileInputStream("text.txt");
            int size = is.available();
            for (int i = 0; i < size; i++) {
                System.out.println((char) is.read() + "  ");
            }
            is.close();

        } catch (IOException e) {
            System.out.println("Exception");

        }
    }
}
