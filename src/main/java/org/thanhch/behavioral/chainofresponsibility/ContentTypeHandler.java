package org.thanhch.behavioral.chainofresponsibility;

/**
 * @author thanhch
 * <p>
 * Date: 13/04/2024
 * <p>
 * Class: ContentTypeHandler
 */
public class ContentTypeHandler implements HandlerChain{
    private String contentType;
    HandlerChain next;

    public ContentTypeHandler(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public String addHandler(String inputHeader) {
        String outputHeader = inputHeader + "\nContentType:" + contentType;
        if (next == null)
            return outputHeader;
        else
            return next.addHandler(outputHeader);
    }
}
