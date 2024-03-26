package org.thanhch.structural.adapter;

/**
 * @author thanhch
 * <p>
 * Date: 26/03/2024
 * <p>
 * Class: LibData
 */
public class LibData {
    float index;
    String data;

    public LibData(float index, String data) {
        this.index = index;
        this.data = data;
    }

    public void displayData(float index, String data) {
        System.out.println("Lib data display: " + index + "-" + data);
    }
}
