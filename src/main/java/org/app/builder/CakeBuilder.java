package org.app.builder;


import org.app.model.cake.Cake;

public interface CakeBuilder {
    CakeBuilder addFirstCakeBase();
    CakeBuilder applyCream();
    CakeBuilder addSecondCakeBase();
    CakeBuilder addAdditionalCream();
    CakeBuilder AddThirdCakeBase();
    Cake build();
}