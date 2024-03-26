package org.thanhch.structural.bridge;

/**
 * @author thanhch
 * <p>
 * Date: 26/03/2024
 * <p>
 * Class: FacebookApp
 */
public class FacebookApp implements App{
    private PhoneOs os;

    public FacebookApp(PhoneOs os) {
        this.os = os;
    }

    @Override
    public void runApplication() {
        os.upload("Facebook upload");
        os.download("Facebook.com");
        os.display("Facebook data");
    }
}
