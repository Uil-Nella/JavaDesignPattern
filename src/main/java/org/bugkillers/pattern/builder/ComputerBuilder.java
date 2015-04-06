/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.bugkillers.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象实例创建器
 * 建造者既是将多个不同种类的对象集中式管理，在一个建造者中有多个不同的对象。
 * 是一个复合对象，而工厂的创建只是针对同一对象进行创建
 * Created by liuxinyu on 15/4/6.
 */
public class ComputerBuilder {

    private List<IComputer> instances = new ArrayList<IComputer>();

    public void produceMac(int count){
        for (int i =0;i < count ; i++ ){
            instances.add(new MacComputer());
        }
    }

    public void produceMsi(int count){
        for (int i = 0 ; i < count ; i ++){
            instances.add(new MsiComputer());
        }
    }

}
