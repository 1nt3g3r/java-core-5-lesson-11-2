import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorTests {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);

        //Single execution
//        service.schedule(
//                () -> System.out.println("Executed!"),
//                1,
//                TimeUnit.SECONDS
//        );

        //Repeatable execution
        service.scheduleAtFixedRate(
                () -> {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(System.currentTimeMillis());
                },
                0,
                1,
                TimeUnit.SECONDS
        );
    }
}
