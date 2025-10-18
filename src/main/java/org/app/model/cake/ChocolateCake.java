package org.app.model.cake;

import org.app.model.CakeType;

public class ChocolateCake extends Cake {
    private String chocolateSponge;
    private String raspberryMousse;
    private String chocolateCream;
    private String chocolateGanash;
    private String raspberry;

    public ChocolateCake(String name) {
        super(name, CakeType.CHOCOLATE_CAKE);
    }

    public String getChocolateSponge() {
        return chocolateSponge;
    }

    public void setChocolateSponge(String chocolateSponge) {
        this.chocolateSponge = chocolateSponge;
    }

    public String getRaspberryMousse() {
        return raspberryMousse;
    }

    public void setRaspberryMousse(String raspberryMousse) {
        this.raspberryMousse = raspberryMousse;
    }

    public String getChocolateCream() {
        return chocolateCream;
    }

    public void setChocolateCream(String chocolateCream) {
        this.chocolateCream = chocolateCream;
    }

    public String getChocolateGanash() {
        return chocolateGanash;
    }

    public void setChocolateGanash(String chocolateGanash) {
        this.chocolateGanash = chocolateGanash;
    }

    public String getRaspberry() {
        return raspberry;
    }

    public void setRaspberry(String raspberry) {
        this.raspberry = raspberry;
    }
}