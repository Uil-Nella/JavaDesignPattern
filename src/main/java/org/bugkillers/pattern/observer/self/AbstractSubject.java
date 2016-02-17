package org.bugkillers.pattern.observer.self;

import java.util.Enumeration;
import java.util.Vector;


/**
 * 抽象主题
 * Created by liuxinyu on 16/2/17.
 */
public abstract class AbstractSubject implements Subject {

    /**
     * 收集观察者集合
     */
    private Vector<Observer> vector = new Vector<Observer>();


    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = vector.elements();
        while (enumo.hasMoreElements()) {
            enumo.nextElement().update();
        }
    }
}