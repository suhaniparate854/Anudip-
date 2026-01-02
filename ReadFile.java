package javaprograms;

import java.io.FileReader;
import java.io.IOException;

class ReadFile {
    public static void main(String[] args) throws Exception {

        FileReader f = new FileReader("\\C:\\Users\\pavan\\OneDrive\\Desktop\\input.txt.txt\\");
        int c, count = 0;

        while ((c = f.read()) != -1) {
            System.out.print((char) c);
            count++;
        }

        f.close();
        System.out.println("\nTotal characters: " + count);
    }
}
