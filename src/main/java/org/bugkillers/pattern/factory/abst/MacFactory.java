/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.bugkillers.pattern.factory.abst;

import org.bugkillers.pattern.factory.IComputer;
import org.bugkillers.pattern.factory.MacComputer;

/**
 * Created by liuxinyu on 15/4/3.
 */
public class MacFactory implements  IProvider{
    @Override
    public IComputer produce() {
        return new MacComputer();
    }
}
