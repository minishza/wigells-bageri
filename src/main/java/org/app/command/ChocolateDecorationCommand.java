package org.app.command;

import org.app.model.cake.Cake;
import org.app.model.cake.ChocolateCake;

public class ChocolateDecorationCommand implements Command {
    private ChocolateCake cake;

    public ChocolateDecorationCommand(Cake cake) {
        this.cake = (ChocolateCake) cake;
    }

    @Override
    public void execute() {
        System.out.println("6. Spackla tårtan med chokladsmörkräm");
        this.cake.setChocolateCream("chocolate cream");

        System.out.println("7. Häll chokladganash på tårtan. Låt det rinna över kanten");
        this.cake.setChocolateGanash("chocolate ganash");

        System.out.println("8. Garnera med hallon");
        this.cake.setRaspberryMousse("raspberry");
    }

    @Override
    public void unexecute() {

    }
}
