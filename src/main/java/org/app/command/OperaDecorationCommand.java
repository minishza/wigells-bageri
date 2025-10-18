package org.app.command;

import org.app.model.cake.Cake;
import org.app.model.cake.OperaCake;

public class OperaDecorationCommand implements Command {
    private OperaCake cake;

    public OperaDecorationCommand(Cake cake) {
        this.cake = (OperaCake) cake;
    }

    @Override
    public void execute() {
        System.out.println("6. Fördela hårt vispad grädde på tårtan så den får en kupolform");
        this.cake.setWhippedCream("whipped cream");

        System.out.println("7. Lägg marsipanlocket på tårtan (rosa)");
        this.cake.setPinkMarzipan("pink marzipan");

        System.out.println("8. Garnera med marsipanros");
        this.cake.setMarzipanRose("marzipan rose");

        System.out.println("9. Pudra över florsocker");
        this.cake.setPowderSugar("powdered sugar");
    }

    @Override
    public void unexecute() {

    }
}