package org.thanhch.structural.proxy;

/**
 * @author thanhch
 * <p>
 * Date: 07/04/2024
 * <p>
 * Class: RealImage
 */
public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        System.out.println("Real image loading: " + filename);
        this.filename = filename;
    }

    @Override
    public void displayImage() {
        System.out.println("Real image is displaying: " + filename);
    }
}
