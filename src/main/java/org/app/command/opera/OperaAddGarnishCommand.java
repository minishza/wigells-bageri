package org.app.command.opera;

import org.app.command.DecorationCommand;
import org.app.model.cake.OperaCake;

public class OperaAddGarnishCommand implements DecorationCommand {
    private final OperaCake cake;

    public OperaAddGarnishCommand(OperaCake cake) {
        this.cake = cake;
    }

    @Override
    public void execute() {
        System.out.println("8. Garnera med marsipanros");
        cake.setMarzipanRose("marzipan rose");
    }
}