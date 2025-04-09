package org.example;

public class EmailNotification extends Notification {

    public EmailNotification(String targetToNotify, String message) {
        super(targetToNotify, message);

    }

    @Override
    public void send() {
        System.out.println("Sending to: " + this.getTargetToNotify());
        System.out.println("Email content: " + this.getMessage());
        System.out.println("Connecting to SMTP server... ");
        System.out.println("Sending email... ");

    }
}
