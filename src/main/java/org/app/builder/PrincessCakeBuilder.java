package org.app.builder;

import org.app.model.cake.Cake;
import org.app.model.cake.PrincessCake;

public class PrincessCakeBuilder implements CakeBuilder{
    private PrincessCake cake;

    public PrincessCakeBuilder(String name) {
        this.cake = new PrincessCake(name);
    }

    @Override
    public CakeBuilder addFirstCakeBase() {
        System.out.println("1. Ta fram en tårtbotten");
        cake.setSponge("sponge");
        return this;
    }

    @Override
    public CakeBuilder applyCream() {
        System.out.println("2. Bred på ett lager vaniljkräm");
        cake.setVanillaCream("vanilla cream");
        return this;
    }

    @Override
    public CakeBuilder addSecondCakeBase() {
        System.out.println("3. Lägg på en tårtbotten");
        cake.setSponge("sponge");
        return this;
    }

    @Override
    public CakeBuilder addAdditionalCream() {
        System.out.println("4. Bred på ett lager vaniljkräm");
        cake.setVanillaCream("vanilla cream");
        return this;
    }

    @Override
    public CakeBuilder AddThirdCakeBase() {
        System.out.println("5. Lägg på en tårtbotten");
        cake.setSponge("sponge");
        return this;
    }

    @Override
    public Cake build() {
        System.out.println(cake.getName() + " BASE READY\n");
        return cake;
    }
}
