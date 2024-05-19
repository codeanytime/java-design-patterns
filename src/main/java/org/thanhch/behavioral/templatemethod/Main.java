package org.thanhch.behavioral.templatemethod;

/**
 * @author thanhch
 * <p>
 * Date: 19/05/2024
 * <p>
 * Class: Main
 */
public class Main {
    public static void main(String[] args) {
        Page homepage = new HomePage();
        homepage.showContents();

        Page detailPage = new DetailPage();
        detailPage.showContents();
    }
}
