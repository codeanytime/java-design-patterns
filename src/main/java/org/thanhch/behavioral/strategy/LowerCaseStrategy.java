package org.thanhch.behavioral.strategy;

/**
 * @author thanhch
 * <p>
 * Date: 13/04/2024
 * <p>
 * Class: LowerCaseStrategy
 */
public class LowerCaseStrategy implements PrintStrategy{
    @Override
    public String formatString(String input) {
        return input.toLowerCase();
    }
}
