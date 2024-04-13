package org.thanhch.behavioral.strategy;

/**
 * @author thanhch
 * <p>
 * Date: 13/04/2024
 * <p>
 * Class: Client
 */
public class Client {
    public static void main(String[] args) {
        Executor executor = new Executor(new LowerCaseStrategy());
        executor.printString("hEllo");

        executor.setStrategy(new UpperCaseStrategy());
        executor.printString("hello");
    }
}
