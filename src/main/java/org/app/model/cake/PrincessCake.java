package org.app.model.cake;

import org.app.model.CakeType;

public class PrincessCake extends Cake {
    public String sponge;
    public String vanillaCream;
    public String whippedCream;
    public String greenMarzipan;
    public String marzipanRose;
    public String powderSugar;

    public PrincessCake(String name) {
        super(name, CakeType.PRINCESS_CAKE);
    }

    public String getSponge() {
        return sponge;
    }

    public void setSponge(String sponge) {
        this.sponge = sponge;
    }

    public String getVanillaCream() {
        return vanillaCream;
    }

    public void setVanillaCream(String vanillaCream) {
        this.vanillaCream = vanillaCream;
    }

    public String getWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(String whippedCream) {
        this.whippedCream = whippedCream;
    }

    public String getGreenMarzipan() {
        return greenMarzipan;
    }

    public void setGreenMarzipan(String greenMarzipan) {
        this.greenMarzipan = greenMarzipan;
    }

    public String getMarzipanRose() {
        return marzipanRose;
    }

    public void setMarzipanRose(String marzipanRose) {
        this.marzipanRose = marzipanRose;
    }

    public String getPowderSugar() {
        return powderSugar;
    }

    public void setPowderSugar(String powderSugar) {
        this.powderSugar = powderSugar;
    }
}