package org.thanhch.structural.bridge;

/**
 * @author thanhch
 * <p>
 * Date: 26/03/2024
 * <p>
 * Class: Client
 */
public class Client {
    public static void main(String[] args) {
        FacebookApp app1 = new FacebookApp(new Android());
        GoogleApp app2 = new GoogleApp(new Android());
        app1.runApplication();
        app2.runApplication();
    }
}
