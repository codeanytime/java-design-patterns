package org.thanhch.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 15/04/2024
 * <p>
 * Class: CommandProcessor
 */
public class CommandProcessor {
    List<Command> commands = new ArrayList<>();

    public CommandProcessor addCommand(Command command) {
        commands.add(command);
        return this;
    }

    public void process() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
