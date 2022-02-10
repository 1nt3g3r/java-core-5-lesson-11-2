package email;

import java.util.ArrayList;
import java.util.List;

public class EmailTests {
    public static void main(String[] args) {
        List<Email> emails = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Email email = new Email("email" + i + "@mail", "Content " + i);
            emails.add(email);
        }

        EmailService emailService = new SendgridEmailService();
        for (Email email : emails) {
            emailService.send(email);
        }

        System.out.println("Continue program execution");
    }
}
