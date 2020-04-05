package Lambda;

import java.io.File;
import java.io.FileFilter;

public class LambdaDemo {
    public static void main(String args[]) {

        //Anonymous class
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return false;
            }
        };

        //With lambda Expression
        FileFilter fileFilter = (File file) -> file.getName().endsWith(".java");


    }
}
