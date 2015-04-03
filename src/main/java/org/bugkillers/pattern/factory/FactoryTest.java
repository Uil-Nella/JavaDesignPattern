/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.bugkillers.pattern.factory;

/**
 * Created by liuxinyu on 15/4/3.
 */
public class FactoryTest {
    public static void main(String[] args) {
        ComputerFactory.produce("mac").work();
        ComputerFactory.produce("mac").work();
        ComputerFactory.produce("msi").work();
    }
}
