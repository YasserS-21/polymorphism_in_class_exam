package org.example;

public class PushNotification extends Notification {
    private String token;
    public PushNotification(String targetToNotify, String message, String token) {
        super(targetToNotify, message);
        this.token = token;
    }

    @Override
    public void send() {
        System.out.println("Sending to: " + this.getTargetToNotify());
        System.out.println("Push notification content: " + this.getMessage());
        System.out.println("Connecting to push notification service...");
        System.out.println("Sending push notification... ");
    }
}
