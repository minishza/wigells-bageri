package org.app.builder;

import org.app.model.cake.Cake;
import org.app.model.cake.ChocolateCake;

public class ChocolateCakeBuilder implements CakeBuilder {
    private ChocolateCake cake;

    public ChocolateCakeBuilder(String name) {
        this.cake = new ChocolateCake(name);
    }

    @Override
    public CakeBuilder addFirstCakeBase() {
        System.out.println("1. Ta fram en chokladtårtbotten");
        cake.setChocolateSponge("chocolate sponge");
        return this;
    }

    @Override
    public CakeBuilder applyCream() {
        System.out.println("2. Bred på ett lager hallonmousse");
        cake.setRaspberryMousse("raspberry mousse");
        return this;
    }

    @Override
    public CakeBuilder addSecondCakeBase() {
        System.out.println("3. Lägg på en chokladtårtbotten");
        cake.setChocolateSponge("chocolate sponge");
        return this;
    }

    @Override
    public CakeBuilder addAdditionalCream() {
        System.out.println("4. Bred på ett lager hallonmousse");
        cake.setRaspberryMousse("raspberry mousse");
        return this;
    }

    @Override
    public CakeBuilder AddThirdCakeBase() {
        System.out.println("5. Lägg på en chokladtårtbotten");
        cake.setChocolateSponge("chocolate sponge");
        return this;
    }

    @Override
    public Cake build() {
        System.out.println(cake.getName() + " BASE READY\n");
        return cake;
    }
}