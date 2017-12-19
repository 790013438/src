package snippets;

import java.io.File;
import java.util.Objects;

class Foreach {

    public static void main(String[] args) {
        File f = new File("/");
        final File[] files = f.listFiles();
        if (Objects.isNull(files))
            return;
        for (File temp : files) {
            if (temp.isFile()) {
                System.out.println(temp.getName());
            }
        }
    }

}
