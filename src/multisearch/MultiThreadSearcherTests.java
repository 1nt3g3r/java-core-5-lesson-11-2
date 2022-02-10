package multisearch;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MultiThreadSearcherTests {
    public static void main(String[] args) throws InterruptedException, IOException {
        String path = "/home/integer/git/java-course";

        long start = System.currentTimeMillis();
        List<File> result = new MultiThreadSearcher().search(path, "first");
        long duration = System.currentTimeMillis() - start;
        System.out.println("duration = " + duration);

        System.out.println("Found: " + result.size());
    }
}
