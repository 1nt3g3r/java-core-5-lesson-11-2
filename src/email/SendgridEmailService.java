package email;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class SendgridEmailService implements EmailService {
    private Executor sender = Executors.newFixedThreadPool(3);

    @Override
    public void send(Email email) {
        sender.execute(() -> sendMessageViaApi(email));
    }

    private void sendMessageViaApi(Email email) {
        //TODO some vendor logic
        try {
            Thread.sleep(1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(email);
    }
}
