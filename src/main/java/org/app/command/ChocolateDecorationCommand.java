package org.app.command;

import org.app.model.cake.ChocolateCake;

public class ChocolateDecorationCommand implements DecorationCommand {

    private final ChocolateCake cake;

    public ChocolateDecorationCommand(ChocolateCake cake) {
        this.cake = cake;
    }

    @Override
    public void execute() {
        System.out.println("6. Spackla tårtan med chokladsmörkräm");
        cake.setChocolateCream("chocolate cream");

        System.out.println("7. Häll chokladganash på tårtan");
        cake.setChocolateGanash("chocolate ganash");

        System.out.println("8. Garnera med hallon");
        cake.setRaspberryMousse("raspberry");
    }
}
