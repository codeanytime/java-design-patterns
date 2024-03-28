package org.thanhch.structural.facade;

/**
 * @author thanhch
 * <p>
 * Date: 29/03/2024
 * <p>
 * Class: Comm
 */
public class Comm {
    public void send(String data) {
        System.out.println("Sending data");
    }

    public void receive(String data) {
        System.out.println("Receiving response");
    }
}
