package org.tnsif.cap.c2tc.ScannerClass;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\Prerana\\Documents\\ML_key.txt")
        );

        String data;

        while ((data = br.readLine()) != null) {
            System.out.println(data);
        }

        br.close();
    }
}
