import java.util.concurrent.Callable;

public class SumCallable implements Callable<Long> {
    private long a;
    private long b;

    public SumCallable(long a, long b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Long call() throws Exception {
        Thread.sleep(1000);
        return a + b;
    }
}
