package org.thanhch.behavioral.command;

/**
 * @author thanhch
 * <p>
 * Date: 15/04/2024
 * <p>
 * Class: Client
 */
public class Client {
    public static void main(String[] args) {
        new CommandProcessor()
                .addCommand(new OrderAddCommand())
                .addCommand(new OrderExecuteCommand())
                .process();

        Account account = new Account(12);
        new AccountDepositCommand(account, 1.0)
                .execute();
        new AccountDepositCommand(account, 1.0)
                .undo();
        System.out.println(account.getBalance());
    }
}
