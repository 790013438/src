package snippets;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtilTest {

    @org.junit.Test
    public void testCopy() throws URISyntaxException {
        Path srcPath = Paths.get(this.getClass().getResource("/haha.txt").toURI());
        Path targetPath = Paths.get("ha-copy.txt");
        FileUtil.copy(srcPath, targetPath);
    }
}
