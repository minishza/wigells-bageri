package org.app.command.opera;

import org.app.command.DecorationCommand;
import org.app.model.cake.OperaCake;

public class OperaApplyMarzipanCommand implements DecorationCommand {
    private final OperaCake cake;

    public OperaApplyMarzipanCommand(OperaCake cake) {
        this.cake = cake;
    }

    @Override
    public void execute() {
        System.out.println("7. Lägg marsipanlocket på tårtan (rosa)");
        cake.setPinkMarzipan("pink marzipan");
    }
}