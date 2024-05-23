package org.thanhch.behavioral.mediator;

/**
 * @author thanhch
 * <p>
 * Date: 19/05/2024
 * <p>
 * Class: ChatUser
 */
public class ChatUser {
    private String name;
    private Mediator mediator;

    public ChatUser(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void sendMessage(String message) {
        System.out.println(name + ": sending message - " + message);
        mediator.sendChatMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.err.println(name + ": receive message - " + message);
    }
}
