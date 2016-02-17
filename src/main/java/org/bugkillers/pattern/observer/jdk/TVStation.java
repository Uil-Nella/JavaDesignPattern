package org.bugkillers.pattern.observer.jdk;

import java.util.Observable;

public class TVStation extends Observable {

    private String programmeName;

    public void play(String programmeName) {
        this.programmeName = programmeName;
        setChanged();
        notifyObservers(this);
    }

    public String getProgrammeName() {
        return programmeName;
    }

}