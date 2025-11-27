package org.app.command.chocolate;

import org.app.command.DecorationCommand;
import org.app.model.cake.ChocolateCake;

public class ChocolateAddGanashCommand implements DecorationCommand {
    private final ChocolateCake cake;

    public ChocolateAddGanashCommand(ChocolateCake cake) {
        this.cake = cake;
    }

    @Override
    public void execute() {
        System.out.println("7. Häll chokladganash på tårtan. Låt det rinna över kanten");
        cake.setChocolateGanash("chocolate ganash");
    }
}