package org.app.model.cake;

import org.app.model.BusinessObject;
import org.app.model.CakeType;

public class Cake extends BusinessObject {
    private CakeType type;

    public Cake(String name, CakeType type) {
        super(name);
        this.type = type;
    }

    public CakeType getType() {
        return type;
    }

    public void setType(CakeType type) {
        this.type = type;
    }
}
