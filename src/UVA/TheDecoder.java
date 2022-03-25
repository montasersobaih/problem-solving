package UVA;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class TheDecoder {

    public static void main(String[] args) throws Exception {
        InputStream input = new BufferedInputStream(System.in);
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        int asc;
        while ((asc = input.read()) != -1) {
            if (asc != '\n') {
                asc -= 7;
            }

            output.write(asc);
        }

        output.writeTo(System.out);
    }
}