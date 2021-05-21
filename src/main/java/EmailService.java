import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailService {


    public void sendEmail() {
        // Add recipient
        String to = "xxxxx@gmail.com";//Replace with customer Email
        String from = "xxxxx@gmail.com";//Replace with support Email
        final String username = "username";//Replace with your Gmail username
        final String password = "password";//Replace with your Gmail password

        String host = "smtp.gmail.com";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");

        // Get the Session object
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            // Create a default MimeMessage object
            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress(from));

            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));

            // Set Subject
            message.setSubject("Thank you for your order!");

            // Put the content of your message
            message.setText("Hi there, your order has been processed!");

            Transport.send(message);

            System.out.println("Email notification sent successfully....");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
