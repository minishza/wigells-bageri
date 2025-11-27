package org.app.command.princess;

import org.app.command.DecorationCommand;
import org.app.model.cake.PrincessCake;

public class PrincessAddGarnishCommand implements DecorationCommand {
    private final PrincessCake cake;

    public PrincessAddGarnishCommand(PrincessCake cake) {
        this.cake = cake;
    }

    @Override
    public void execute() {
        System.out.println("8. Garnera med marsipanros");
        cake.setMarzipanRose("marzipan rose");
    }
}

