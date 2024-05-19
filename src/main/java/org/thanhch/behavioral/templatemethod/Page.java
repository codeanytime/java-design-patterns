package org.thanhch.behavioral.templatemethod;

/**
 * @author thanhch
 * <p>
 * Date: 19/05/2024
 * <p>
 * Class: Page
 */
public abstract class Page {
    void showHeader() {
        System.out.println("<Header>This is header</Header>");
    }
    abstract void showBody();
    void showFooter() {
        System.out.println("<Footer>This is footer</Footer>");
    }
    final void showContents() {
        showHeader();
        showBody();
        showFooter();
    }
}
