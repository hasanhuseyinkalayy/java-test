package practice_5;

import java.io.IOException;
import java.io.InputStreamReader;

public class Streams {
    public static void main(String[] args) throws IOException {
        InputStreamReader cin = null;
        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Enter characters,'q' to quit.");
            char c;
            do {
                c = (char) System.in.read();
                System.out.print(c);
            } while (c != 'q');

        } finally {
            if (cin != null) {
                cin.close();
            }
        }
    }
}
