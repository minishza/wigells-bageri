package org.app.command.princess;

import org.app.command.DecorationCommand;
import org.app.model.cake.PrincessCake;

public class PrincessApplyCreamCommand implements DecorationCommand {
    private final PrincessCake cake;

    public PrincessApplyCreamCommand(PrincessCake cake) {
        this.cake = cake;
    }

    @Override
    public void execute() {
        System.out.println("6. Fördela hårt vispad grädde på tårtan så den får en kupolform");
        cake.setWhippedCream("whipped cream");
    }
}