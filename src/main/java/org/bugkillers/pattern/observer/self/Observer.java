package org.bugkillers.pattern.observer.self;

/**
 * 观察者接口
 */
public interface Observer {

    /**
     * 被观察者发生变化时观察者的动作
     */
    void update();
}