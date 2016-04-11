package com.raspi.labs.twitter4j.examples;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 * Example application that sends a message from specified account.<br>
 */
public final class SendMessage {
    public static void main(String[] args) {
        Twitter twitter = new TwitterFactory().getInstance();
        try {
            twitter.updateStatus("Hello Buddy... first tweet from Twitter4J :)");
            System.exit(0);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to send a direct message: " + te.getMessage());
            System.exit(-1);
        }
    }
}
