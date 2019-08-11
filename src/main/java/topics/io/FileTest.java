package topics.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/arquivo.txt");

        try {
            file.createNewFile();

            System.out.println(file.getCanonicalPath());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.isDirectory());
            System.out.println(file.isHidden());
            System.out.println();
            System.out.println(new Date(file.lastModified()));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
