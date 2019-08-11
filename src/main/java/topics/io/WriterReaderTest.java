package topics.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterReaderTest {

    public static void main(String[] args) throws IOException {
        final File file = new File("src/main/resources/arquivo.txt");

        final FileWriter writer = new FileWriter(file);
        writer.write("Escrevendo uma mensagem no arquivo.\n");
        writer.write("Testando escrita de mensagem.\n");
        writer.flush();
        writer.close();

        final FileReader reader = new FileReader(file);
        char[] in = new char[500];
        reader.read(in);

        for (char c : in) {
            System.out.print(c);
        }

        reader.close();
    }
}
