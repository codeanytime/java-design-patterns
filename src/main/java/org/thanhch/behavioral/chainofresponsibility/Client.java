package org.thanhch.behavioral.chainofresponsibility;

/**
 * @author thanhch
 * <p>
 * Date: 13/04/2024
 * <p>
 * Class: Client
 */
public class Client {
    public static void main(String[] args) {
        AuthenticationHandler auth = new AuthenticationHandler("12345");
        ContentTypeHandler type = new ContentTypeHandler("json");
        PayloadHandler payload = new PayloadHandler("Body: {\"username\": \"admin\"}");
        auth.next = type;
        type.next = payload;

        String headerWithAuthen = auth.addHandler("Header with authentication: ");
        System.out.println(headerWithAuthen);
    }
}
