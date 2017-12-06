package snippets;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public final class FileUtil {

    public static void copy(Path src, Path target) {
        try {
            Files.copy(src, target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
