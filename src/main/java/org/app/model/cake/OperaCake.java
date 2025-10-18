package org.app.model.cake;


import org.app.model.CakeType;

public class OperaCake extends Cake{
    public String sponge;
    public String vanillaCream;
    public String raspberryJam;
    public String whippedCream;
    public String pinkMarzipan;
    public String marzipanRose;
    public String powderSugar;

    public OperaCake(String name) {
        super(name, CakeType.OPERA_CAKE);
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

    public String getRaspberryJam() {
        return raspberryJam;
    }

    public void setRaspberryJam(String raspberryJam) {
        this.raspberryJam = raspberryJam;
    }

    public String getWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(String whippedCream) {
        this.whippedCream = whippedCream;
    }

    public String getPinkMarzipan() {
        return pinkMarzipan;
    }

    public void setPinkMarzipan(String pinkMarzipan) {
        this.pinkMarzipan = pinkMarzipan;
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