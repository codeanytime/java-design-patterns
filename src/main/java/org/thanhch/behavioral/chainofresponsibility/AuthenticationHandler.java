package org.thanhch.behavioral.chainofresponsibility;

/**
 * @author thanhch
 * <p>
 * Date: 13/04/2024
 * <p>
 * Class: AuthenticationHandler
 */
public class AuthenticationHandler implements HandlerChain{
    private String token;
    HandlerChain next;

    public AuthenticationHandler(String token) {
        this.token = token;
    }

    @Override
    public String addHandler(String inputHeader) {
        String outputHeader = inputHeader + "\nAuthentication:" + token;
        if (next == null)
            return outputHeader;
        else
            return next.addHandler(inputHeader);
    }
}
