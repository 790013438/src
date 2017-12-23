package snippets;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class FileUtil {

    public static void copy(Path src, Path target) {
        try {
            Files.copy(src, target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
