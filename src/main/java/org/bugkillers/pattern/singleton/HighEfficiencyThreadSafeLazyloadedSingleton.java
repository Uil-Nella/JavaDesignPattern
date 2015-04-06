/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.bugkillers.pattern.singleton;

/**
 * Created by liuxinyu on 15/4/6.
 */
public class HighEfficiencyThreadSafeLazyloadedSingleton {
    /**
     * 持有自己的引用
     */
    private static HighEfficiencyThreadSafeLazyloadedSingleton instance;

    private HighEfficiencyThreadSafeLazyloadedSingleton() {
        if (instance != null) {
            throw new IllegalStateException("实例已经被初始化");
        }
    }

}
