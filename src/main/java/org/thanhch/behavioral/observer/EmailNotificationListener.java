package org.thanhch.behavioral.observer;

/**
 * @author thanhch
 * <p>
 * Date: 12/04/2024
 * <p>
 * Class: EmailNotificationListener
 */
public class EmailNotificationListener implements EventListener{
    @Override
    public void notify(String eventType, String filename) {
        System.out.println("Email notification: " + eventType + " perform on file " + filename);
    }
}
