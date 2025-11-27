package org.app.model.cake;

import org.app.model.BusinessObject;
import org.app.model.CakeStatus;
import org.app.model.CakeType;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Cake extends BusinessObject {
    private CakeType type;
    private CakeStatus status;
    private final PropertyChangeSupport pcs;

    public Cake(String name, CakeType type) {
        super(name);
        this.type = type;
        this.status = CakeStatus.ORDERED;
        this.pcs = new PropertyChangeSupport(this);
    }

    public CakeType getType() {
        return type;
    }

    public void setType(CakeType type) {
        this.type = type;
    }

    public CakeStatus getStatus() {
        return status;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }

    public void notifyReadyForPickup() {
        CakeStatus oldStatus = this.status;
        this.status = CakeStatus.PICKUP_READY;
        pcs.firePropertyChange("status", oldStatus, this.status + " of " + this.name);
    }
}
