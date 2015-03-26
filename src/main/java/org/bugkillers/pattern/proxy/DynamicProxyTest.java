/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.bugkillers.pattern.proxy;

/**
 * Created by liuxinyu on 15/3/26.
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        DynamicProxy proxy = new DynamicProxy();
        Target target = (Target)proxy.bind(new TargetImpl());
        target.method();
    }
}
