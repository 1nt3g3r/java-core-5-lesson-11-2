import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorTests {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        List<Future<?>> futures = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            futures.add(executor.submit(new PrintRunnable(i)));
        }

        while (true) {
            long finishedCount = futures.stream().filter(Future::isDone).count();
            System.out.println("finishedCount = " + finishedCount);

            Thread.sleep(500l);
        }
    }
}
