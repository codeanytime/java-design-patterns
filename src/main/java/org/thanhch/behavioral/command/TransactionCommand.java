package org.thanhch.behavioral.command;

/**
 * @author thanhch
 * <p>
 * createdDate: 15/04/2024
 * Interface TransactionCommand
 */
public interface TransactionCommand {
    void execute();
    void undo();
}
