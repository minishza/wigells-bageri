package org.app.command.chocolate;

import org.app.command.DecorationCommand;
import org.app.model.cake.ChocolateCake;

public class ChocolateAddGarnishCommand implements DecorationCommand {
    private final ChocolateCake cake;

    public ChocolateAddGarnishCommand(ChocolateCake cake) {
        this.cake = cake;
    }

    @Override
    public void execute() {
        System.out.println("8. Garnera med hallon");
        cake.setRaspberry("raspberry");
    }
}
