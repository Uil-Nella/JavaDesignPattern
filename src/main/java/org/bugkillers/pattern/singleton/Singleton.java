package org.bugkillers.pattern.singleton;

/**
 * Created by liuxinyu on 16/6/14.
 */
public class Singleton {

    //添加 volatile
    private static volatile Singleton singleton = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
