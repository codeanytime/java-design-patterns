package org.thanhch.behavioral.command;

/**
 * @author thanhch
 * <p>
 * Date: 15/04/2024
 * <p>
 * Class: AccountDepositCommand
 */
public class AccountDepositCommand implements TransactionCommand{
    private Account account;
    private double amount;

    public AccountDepositCommand(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.deposit(amount);
    }

    @Override
    public void undo() {
        account.withdraw(amount);
    }
}
