package org.thanhch.behavioral.observer;

/**
 * @author thanhch
 * <p>
 * Date: 11/04/2024
 * <p>
 * Class: EventListener
 */
public interface EventListener {
    void notify(String eventType, String filename);
}
