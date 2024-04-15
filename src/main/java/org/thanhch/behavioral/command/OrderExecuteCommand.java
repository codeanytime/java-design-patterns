package org.thanhch.behavioral.command;

/**
 * @author thanhch
 * <p>
 * Date: 15/04/2024
 * <p>
 * Class: OrderExecuteCommand
 */
public class OrderExecuteCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Order execute");
    }
}
