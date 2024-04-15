package org.thanhch.behavioral.command;

/**
 * @author thanhch
 * <p>
 * Date: 15/04/2024
 * <p>
 * Class: OrderAddCommand
 */
public class OrderAddCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Order add processing!");
    }
}
