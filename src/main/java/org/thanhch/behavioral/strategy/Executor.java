package org.thanhch.behavioral.strategy;

/**
 * @author thanhch
 * <p>
 * Date: 13/04/2024
 * <p>
 * Class: Executor
 */
public class Executor {
    private PrintStrategy strategy;

    public void setStrategy(PrintStrategy strategy) {
        this.strategy = strategy;
    }

    public Executor(PrintStrategy strategy) {
        this.strategy = strategy;
    }

    public void printString(String input) {
        System.out.println(strategy.formatString(input));
    }
}
