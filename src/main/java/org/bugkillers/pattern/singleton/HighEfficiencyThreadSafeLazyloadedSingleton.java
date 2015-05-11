/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.bugkillers.pattern.singleton;

/**
 * 一个相对完善的单例模式，避免了synchronized关键字对方法加锁，同时对方法加锁时采取了对class的monitor加锁
 * 相对于对方法加锁，有一定程度的提高，在单例私有构造器的多次创建也采取的抛出异常的处理。
 * Created by liuxinyu on 15/4/6.
 */
public class HighEfficiencyThreadSafeLazyloadedSingleton {
    /**
     * 持有自己的引用
     */
    private static HighEfficiencyThreadSafeLazyloadedSingleton instance;

    /**
     * 私有化构造器，并在多线程中不被多次创建，并在防止使用反射的工具创建实例时抛出异常。
     */
    private HighEfficiencyThreadSafeLazyloadedSingleton() {
        if (instance != null) {
            throw new IllegalStateException("实例已经被初始化");
        }
    }

    /**
     * 单例获取方法
     * 创建单例时需要对实例进行校验，只有实例没有创建时才对其进行加锁创建实例
     *
     * @return
     */
    public static HighEfficiencyThreadSafeLazyloadedSingleton getInstance() {
        if (instance == null) {
            synchronized (HighEfficiencyThreadSafeLazyloadedSingleton.class) {
                instance = new HighEfficiencyThreadSafeLazyloadedSingleton();
            }
        }

        return instance;
    }

}
