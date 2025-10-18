package org.app.command;

import org.app.model.cake.Cake;
import org.app.model.cake.PrincessCake;

public class PrincessDecorationCommand implements Command {
    private PrincessCake cake;

    public PrincessDecorationCommand(Cake cake) {
        this.cake = (PrincessCake) cake;
    }

    @Override
    public void execute() {
        System.out.println("6. Fördela hårt vispad grädde på tårtan så den får en kupolform");
        this.cake.setWhippedCream("whipped cream");

        System.out.println("7. Lägg marsipanlocket på tårtan (grönt)");
        this.cake.setGreenMarzipan("green marzipan");

        System.out.println("8. Garnera med marsipanros");
        this.cake.setMarzipanRose("marzipan rose");

        System.out.println("9. Pudra över florsocker");
        this.cake.setPowderSugar("powdered sugar");
    }

    @Override
    public void unexecute() {

    }
}
