package network;


import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.io.IOException;
import java.util.Properties;

public class Email {
    public static void main(String[] args) throws IOException, MessagingException {
        final Properties properties = new Properties();
        properties.load(Email.class.getClassLoader().getResourceAsStream("mail.properties"));

        Session mailSession = Session.getDefaultInstance(properties);
        MimeMessage message = new MimeMessage(mailSession);
        message.setFrom(new InternetAddress("mackcik228225@gmail.com"));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress("igor.sperik@bk.ru"));
        message.setSubject("hello");
        message.setText("I love u Igoreshka");

        Transport tr = mailSession.getTransport();
        tr.connect(null,"davhes-nokhyc-1hinWa");
        tr.sendMessage(message, message.getAllRecipients());
        tr.close();

    }
}