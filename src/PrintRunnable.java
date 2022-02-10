public class PrintRunnable implements Runnable {
    private Object item;

    public PrintRunnable(Object item) {
        this.item = item;
    }

    @Override
    public void run() {
        System.out.println(item);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
