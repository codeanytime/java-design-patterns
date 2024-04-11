package org.thanhch.behavioral.observer;

/**
 * @author thanhch
 * <p>
 * Date: 12/04/2024
 * <p>
 * Class: Client
 */
public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        EmailNotificationListener emailNotificationListener = new EmailNotificationListener();
        LogListener logListener = new LogListener();

        editor.events.subscribe("open", emailNotificationListener);
        editor.events.subscribe("save", emailNotificationListener);
        editor.events.subscribe("open", logListener);
        editor.events.subscribe("save", logListener);
        editor.events.unsubscribe("save", logListener);
        editor.openFile("test.png");
        editor.saveFile();
    }
}
