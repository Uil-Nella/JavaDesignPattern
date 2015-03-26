/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.bugkilers.pattern.decorator;

/**
 * CPU装饰器
 * Created by liuxinyu on 15/3/23.
 */
public class ComputerCPU extends ComputerDecorator  {
    IComputer computer;

    public ComputerCPU(IComputer computer){
        this.computer = computer;
    }

    @Override
    public String build() {
        return computer.build()+"-组装CPU-";
    }

    @Override
    public int cost() {
        return 1000+computer.cost();
    }
}
