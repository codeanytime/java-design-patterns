package org.thanhch.structural.bridge;

/**
 * @author thanhch
 * <p>
 * Date: 26/03/2024
 * <p>
 * Class: GoogleApp
 */
public class GoogleApp implements App{
    PhoneOs os;

    public GoogleApp(PhoneOs os) {
        this.os = os;
    }

    @Override
    public void runApplication() {
        os.upload("Google upload");
        os.download("Google.com");
        os.display("Google data");
    }
}
