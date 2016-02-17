package org.bugkillers.pattern.observer.jdk;


import java.util.Observable;
import java.util.Observer;

public class Reader implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Publisher) {
            Publisher p = (Publisher) o;
            System.out.println("我要订阅" + p.getMagazineName());
        }
        if (o instanceof TVStation) {
            TVStation t = (TVStation) o;
            System.out.println("我要收看" + t.getProgrammeName());
        }
    }

}
