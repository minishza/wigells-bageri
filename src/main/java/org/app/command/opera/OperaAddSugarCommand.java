package org.app.command.opera;

import org.app.command.DecorationCommand;
import org.app.model.cake.OperaCake;

public class OperaAddSugarCommand implements DecorationCommand {
    private final OperaCake cake;

    public OperaAddSugarCommand(OperaCake cake) {
        this.cake = cake;
    }

    @Override
    public void execute() {
        System.out.println("9. Pudra över florsocker");
        cake.setPowderSugar("powdered sugar");
    }
}