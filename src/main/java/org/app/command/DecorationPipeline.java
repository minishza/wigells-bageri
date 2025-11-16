package org.app.command;

import java.util.ArrayList;
import java.util.List;

public class DecorationPipeline {
    private final List<DecorationCommand> commands = new ArrayList<>();

    public void addCommand(DecorationCommand command) {
        commands.add(command);
    }

    public void executeAll() {
        for (DecorationCommand command : commands) {
            command.execute();
        }
    }
}
