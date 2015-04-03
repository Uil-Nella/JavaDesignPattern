/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.bugkillers.pattern.factory;

/**
 * computer 生产工厂类
 * Created by liuxinyu on 15/4/3.
 */
public class ComputerFactory {
    /**
     * 根据品牌名称获取相应对象
     * @param brand 品牌名称
     * @return
     */
    public static IComputer produce(String brand){
        if ("mac".equalsIgnoreCase(brand)){
            return  new MacComputer();
        }
        if ("msi".equalsIgnoreCase(brand)){
            return  new MsiComputer();
        }
        return null;
    }
}
