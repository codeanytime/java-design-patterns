package org.thanhch.structural.bridge;

/**
 * @author thanhch
 * <p>
 * Date: 26/03/2024
 * <p>
 * Class: Android
 */
public class Android implements PhoneOs {
    @Override
    public void upload(String data) {
        System.out.println("Android uploading data: " + data);
    }

    @Override
    public void download(String url) {
        System.out.println("Android downloading url: " + url);
    }

    @Override
    public void display(String data) {
        System.out.println("Android displaying data: " + data);
    }
}
