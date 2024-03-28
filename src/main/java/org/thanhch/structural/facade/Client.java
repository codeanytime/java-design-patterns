package org.thanhch.structural.facade;

/**
 * @author thanhch
 * <p>
 * Date: 29/03/2024
 * <p>
 * Class: Client
 */
public class Client {
    public static void main(String[] args) {
        NetworkAccessFacade networkAccess = new NetworkAccessFacade();
        networkAccess.communicate();
    }
}
