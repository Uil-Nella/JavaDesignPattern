/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.bugkillers.pattern.proxy;

/**
 * 代理类
 * Created by liuxinyu on 15/3/26.
 */
public class CommonProxy implements Target {

    private Target target;

    public CommonProxy(){
        this.target = new TargetImpl();
    }

    public void before(){
        System.out.println("before method！");
    }


    @Override
    public void method() {
        this.before();
        this.target.method();
        this.after();
    }

    public void after(){
        System.out.println("after method！");
    }
}
