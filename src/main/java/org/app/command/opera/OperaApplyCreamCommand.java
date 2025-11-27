package org.app.command.opera;

import org.app.command.DecorationCommand;
import org.app.model.cake.OperaCake;

public class OperaApplyCreamCommand implements DecorationCommand {
    private final OperaCake cake;

    public OperaApplyCreamCommand(OperaCake cake) {
        this.cake = cake;
    }

    @Override
    public void execute() {
        System.out.println("6. Fördela hårt vispad grädde på tårtan så den får en kupolform");
        cake.setWhippedCream("whipped cream");
    }
}
