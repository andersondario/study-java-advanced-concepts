package topics.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest {

    private static final String RESOURCE_DIR = "src/main/resources";

    public static void main(String[] args) throws IOException {
        final Path path = Paths.get(RESOURCE_DIR + "/arquivo.txt");
        System.out.println(path.toAbsolutePath());

        final Path subResourceDir = Paths.get(RESOURCE_DIR + "/nio");
        final Path subResourceDeepDir = Paths.get(RESOURCE_DIR + "/nio/oi/ah/q");
        final Path file = Paths.get(RESOURCE_DIR + "/nio/file.txt");

        if (Files.notExists(subResourceDir)) {
            Files.createDirectory(subResourceDir);
        } else if (Files.notExists(subResourceDeepDir)) {
            Files.createDirectories(subResourceDeepDir);
        }

        Path source = Paths.get(RESOURCE_DIR + "/arquivoSource.txt");
        Path target = Paths.get(RESOURCE_DIR + "/arquivoTarget.txt");

        if (Files.notExists(source)) Files.createFile(source);

        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
