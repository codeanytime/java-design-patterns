package org.thanhch.behavioral.mediator;

/**
 * @author thanhch
 * <p>
 * Date: 23/05/2024
 * <p>
 * Class: Client
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        ChatUser alice = new ChatUser("alice", mediator);
        ChatUser peter = new ChatUser("peter", mediator);
        ChatUser tom = new ChatUser("tom", mediator);
        mediator.addUser(alice).addUser(peter).addUser(tom);

        alice.sendMessage("Hi every one");
    }
}
