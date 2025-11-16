package org.app.command;

import org.app.model.cake.OperaCake;

public class OperaDecorationCommand implements DecorationCommand {

    private final OperaCake cake;

    public OperaDecorationCommand(OperaCake cake) {
        this.cake = cake;
    }

    @Override
    public void execute() {
        System.out.println("6. Fördela hårt vispad grädde...");
        cake.setWhippedCream("whipped cream");

        System.out.println("7. Lägg marsipanlock (rosa)");
        cake.setPinkMarzipan("pink marzipan");

        System.out.println("8. Garnera med marsipanros");
        cake.setMarzipanRose("marzipan rose");

        System.out.println("9. Pudra över florsocker");
        cake.setPowderSugar("powdered sugar");
    }
}
