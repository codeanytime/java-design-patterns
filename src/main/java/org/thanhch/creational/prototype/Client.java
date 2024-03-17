package org.thanhch.creational.prototype;

/**
 * @author thanhch
 * <p>
 * Date: 17/03/2024
 * <p>
 * Class: Client
 */
public class Client {
    public static void main(String[] args) {
        Vehicle b1 = new Bicycle(2, 500, true);
        Vehicle b2 = b1.clone();
    }
}
