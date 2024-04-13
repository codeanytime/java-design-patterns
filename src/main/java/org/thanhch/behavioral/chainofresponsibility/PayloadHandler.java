package org.thanhch.behavioral.chainofresponsibility;

/**
 * @author thanhch
 * <p>
 * Date: 13/04/2024
 * <p>
 * Class: PayloadHandler
 */
public class PayloadHandler implements HandlerChain{
    private String payload;
    HandlerChain next;

    public PayloadHandler(String payload) {
        this.payload = payload;
    }

    @Override
    public String addHandler(String inputHeader) {
        String outputHeader = inputHeader + "\n" + payload;
        if (next == null)
            return outputHeader;
        else
            return next.addHandler(outputHeader);
    }
}
