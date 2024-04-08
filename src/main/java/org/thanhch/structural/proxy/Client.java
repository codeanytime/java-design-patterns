package org.thanhch.structural.proxy;

/**
 * @author thanhch
 * <p>
 * Date: 07/04/2024
 * <p>
 * Class: Client
 */
public class Client {
    public static void main(String[] args) {
        Image image = new ImageProxy("test.png");
        image.displayImage();
        System.out.println("");
        image.displayImage();
    }
}
