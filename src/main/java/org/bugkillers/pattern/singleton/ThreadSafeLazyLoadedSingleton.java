/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.bugkillers.pattern.singleton;

/**
 * 线程安全的单例，当有线程访问的时候才被调用，但是整个方法都被加了
 * synchronized 锁，有效率损失，是一种并不完美的单例。
 * Created by liuxinyu on 15/4/6.
 */
public class ThreadSafeLazyLoadedSingleton {

    /**
     * 私有化构造器
     */
    private ThreadSafeLazyLoadedSingleton(){

    }

    private static ThreadSafeLazyLoadedSingleton instance = null;

    /**
     * 静态方法用于获取实例
     * @return
     */
    public static synchronized  ThreadSafeLazyLoadedSingleton getInstance(){
        if (instance != null){
            instance = new ThreadSafeLazyLoadedSingleton();
        }
        return  instance;

    }
}
