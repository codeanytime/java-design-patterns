package org.thanhch.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 23/05/2024
 * <p>
 * Class: Mediator
 */
public class Mediator {
    List<ChatUser> users = new ArrayList<>();

    public Mediator addUser(ChatUser user) {
        users.add(user);
        return this;
    }

    public void sendChatMessage(String message, ChatUser sender) {
        for (ChatUser user: users) {
            if (user != sender) {
                user.receiveMessage(message);
            }
        }
    }
}
