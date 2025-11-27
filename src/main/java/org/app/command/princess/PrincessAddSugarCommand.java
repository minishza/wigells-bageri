package org.app.command.princess;

import org.app.command.DecorationCommand;
import org.app.model.cake.PrincessCake;

public class PrincessAddSugarCommand implements DecorationCommand {
    private final PrincessCake cake;

    public PrincessAddSugarCommand(PrincessCake cake) {
        this.cake = cake;
    }

    @Override
    public void execute() {
        System.out.println("9. Pudra över florsocker");
        cake.setPowderSugar("powdered sugar");
    }
}