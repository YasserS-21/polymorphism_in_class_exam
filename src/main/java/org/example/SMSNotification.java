package org.example;

public class SMSNotification extends Notification {

    public SMSNotification(String targetToNotify, String message) {
        super(targetToNotify, message);
    }

    @Override
    public void send() {
        System.out.println("Sending to: " + this.getTargetToNotify());
        System.out.println("SMS content: " + this.getMessage());
        System.out.println("Connecting to SMS gateway...");
        System.out.println("Sending SMS... ");
    }
}