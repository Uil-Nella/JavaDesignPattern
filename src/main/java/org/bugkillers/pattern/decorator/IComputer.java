/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.bugkillers.pattern.decorator;

/**
 * 电脑组装接口
 * Created by liuxinyu on 15/3/23.
 */
public interface IComputer {
    /**
     * 组装动作
     */
    public String build();

    /**
     * 花费
     * @return
     */
    public int cost();
}
