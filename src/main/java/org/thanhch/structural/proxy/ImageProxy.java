package org.thanhch.structural.proxy;

/**
 * @author thanhch
 * <p>
 * Date: 07/04/2024
 * <p>
 * Class: ImageProxy
 */
public class ImageProxy implements Image {
    private String filename;
    private RealImage realImage;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void displayImage() {
        System.out.println("Proxy image displaying: " + filename);
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.displayImage();
        System.out.println("Logging: " + realImage);
    }
}
