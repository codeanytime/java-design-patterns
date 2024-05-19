package org.thanhch.behavioral.templatemethod;

/**
 * @author thanhch
 * <p>
 * Date: 19/05/2024
 * <p>
 * Class: Header
 */
public class HomePage extends Page{
    @Override
    void showBody() {
        System.out.println("Content of homepage");
    }
}
