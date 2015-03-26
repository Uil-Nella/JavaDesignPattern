/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.bugkilers.pattern.decorator;

/**
 * 联想电脑类
 * Created by liuxinyu on 15/3/23.
 */
public class LenovoComputer implements IComputer{

    @Override
    public String build() {
        return "联想电脑:";
    }

    @Override
    public int cost() {
        return 1000;
    }
}
