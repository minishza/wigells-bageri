package org.app.command.chocolate;


import org.app.command.DecorationCommand;
import org.app.model.cake.ChocolateCake;

public class ChocolateApplyCreamCommand implements DecorationCommand {
    private final ChocolateCake cake;

    public ChocolateApplyCreamCommand(ChocolateCake cake) {
        this.cake = cake;
    }

    @Override
    public void execute() {
        System.out.println("6. Spackla tårtan med chokladsmörkräm");
        cake.setChocolateCream("chocolate cream");
    }
}