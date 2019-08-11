package topics.io;

import java.io.File;
import java.io.IOException;

public class FileDirectoryTest {

    public static void main(String[] args) throws IOException {
        final File directory = new File("src/main/resources/folder");
        directory.mkdir();

        final File file = new File(directory, "arquivo.txt");
        file.createNewFile();

        final File fileWithNewName = new File(directory, "arquivoRenomeado.txt");
        file.renameTo(fileWithNewName);
    }
}
