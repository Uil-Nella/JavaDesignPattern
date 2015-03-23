/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.bugkilers.pattern.decorator;

/**
 * Created by liuxinyu on 15/3/23.
 */
public class ComputerHardWare extends ComputerDecorator  {
    IComputer computer;

    public ComputerHardWare(IComputer computer){
        this.computer = computer;
    }

    @Override
    public String build() {
        return computer.build()+"--组装硬盘--";
    }

    @Override
    public int cost() {
        return 1000+computer.cost();
    }
}
