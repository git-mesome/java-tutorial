package com.example.java_tutorial.poly.ex.sendar;

public class SendMain {
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new InstagramSender()};

        for (Sender sender : senders){
            sender.sendMessage("Welcome!");
        }

    }
}
