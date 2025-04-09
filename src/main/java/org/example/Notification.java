package org.example;

public abstract class Notification {
    private String targetToNotify;
    private String message;

    public Notification(String targetToNotify, String message) {
        this.targetToNotify = targetToNotify;
        this.message = message;
    }

    public String getTargetToNotify() {
        return  this.targetToNotify;
    }
    public String getMessage() {
        return this.message;
    }

    public abstract void send();

    public void displayInfo() {
        System.out.println("Sending to:" + this.getTargetToNotify());
        System.out.println("Message:" + this.getMessage());
        System.out.println("Sending");
    }

    public void sendGeneral() {

    }
}