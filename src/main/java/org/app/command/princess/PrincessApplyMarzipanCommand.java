package org.app.command.princess;

import org.app.command.DecorationCommand;
import org.app.model.cake.PrincessCake;

public class PrincessApplyMarzipanCommand implements DecorationCommand {
    private final PrincessCake cake;

    public PrincessApplyMarzipanCommand(PrincessCake cake) {
        this.cake = cake;
    }

    @Override
    public void execute() {
        System.out.println("7. Lägg marsipanlocket på tårtan (grönt)");
        cake.setGreenMarzipan("green marzipan");
    }
}