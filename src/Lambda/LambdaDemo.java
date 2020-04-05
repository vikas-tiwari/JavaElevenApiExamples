package Lambda;

import java.io.File;
import java.io.FileFilter;
import java.util.*;

public class LambdaDemo {
    public static void main(String args[]) {

        //Anonymous class
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().endsWith(".java");
            }
        };

        //With lambda Expression
        FileFilter fileFilter = (File file) -> file.getName().endsWith(".java");


        File dir = new File("/home/vikas/IdeaProjects/JavaElevenApiExamples/src/Lambda");
        File[] files = dir.listFiles(fileFilter);
        for(File file : files) {
            System.out.println(file);
        }


        //Anonymous class
        Runnable runnableClass = new Runnable() {
            @Override
            public void run() {
                System.out.print("Inside runnable anonymous class");
            }
        };

        //Lambda expression
        Runnable runnableLambda = () -> {
            for (int i=0;i<3;i++) {
                System.out.println("Inside lambda expression");
            }
        };

        Thread thread = new Thread(runnableLambda);
        thread.start();

        //Anonymous class
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.compareTo(t1);
            }
        };

        //Lambda
        Comparator<String> stringComparator = (s1, s2) -> s1.compareTo(s2);

        List<String> list = Arrays.asList("India"," USA", "Canada");
        Collections.sort(list, stringComparator);

        for(String s: list) {
            System.out.println(s);
        }

    }
}
