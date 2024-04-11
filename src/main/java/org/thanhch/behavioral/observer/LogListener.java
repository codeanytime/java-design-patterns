package org.thanhch.behavioral.observer;

/**
 * @author thanhch
 * <p>
 * Date: 12/04/2024
 * <p>
 * Class: LogListener
 */
public class LogListener implements EventListener{
    @Override
    public void notify(String eventType, String filename) {
        System.out.println("Log listener " + eventType + " perform on file " + filename);
    }
}
