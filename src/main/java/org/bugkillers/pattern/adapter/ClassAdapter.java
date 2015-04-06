/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.bugkillers.pattern.adapter;

/**
 * 类的适配器
 * 功能：将targetable接口的方法成功的配到了Source类中
 * Created by liuxinyu on 15/4/6.
 */
public class ClassAdapter extends Source implements Targetable {

    @Override
    public void methodII() {
        System.out.println("被適配接口方法被执行!");
    }
}
