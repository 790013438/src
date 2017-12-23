package snippets;

import java.io.File;
import java.util.Objects;

class Foreach {

    public static void main(String[] args) {
        File f = new File("/");
        showDirectory(f);
    }

    public static void showDirectory(File f) {
        _walkDirectory(f, 0);
    }

    private static void _walkDirectory(File f, int level) {
        if (f.isDirectory()) {
            if (Objects.nonNull(f.listFiles()))
                for (File temp : f.listFiles()) {
                    _walkDirectory(temp, level + 1);
                }
        } else {
            for (int i = 0; i < level - 1; ++i) {
                System.out.print("    ");
            }
            System.out.println(f.getName());
        }
    }
}
