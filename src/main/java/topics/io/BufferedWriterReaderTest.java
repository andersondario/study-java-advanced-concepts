package topics.io;

import java.io.*;

import static utils.ObjectUtils.isNotNull;

public class BufferedWriterReaderTest {

    public static void main(String[] args) throws IOException {
        final File file = new File("src/main/resources/arquivo.txt");

        final FileWriter fileWriter = new FileWriter(file);
        final BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("Escrevendo uma mensagem no arquivo.\n");
        bufferedWriter.write("Testando escrita de mensagem.\n");
        bufferedWriter.flush();
        bufferedWriter.close();

        final FileReader fileReader = new FileReader(file);
        final BufferedReader bufferedReader = new BufferedReader(fileReader);

        String text = bufferedReader.readLine();
        while (isNotNull(text)) {
            System.out.println(text);
            text = bufferedReader.readLine();
        }

        bufferedReader.close();
    }
}
