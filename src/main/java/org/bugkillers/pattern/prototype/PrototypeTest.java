/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.bugkillers.pattern.prototype;

/**
 * Created by liuxinyu on 15/4/6.
 */
public class PrototypeTest {

    public static void main(String[] args) {
        HeroFactory factory;
        Mage mage;
        Warlord warlord;
        Beast beast;


        factory = new HeroFactoryImpl(new ElfMage(), new ElfWarlord(),
                new ElfBeast());
        mage = factory.createMage();
        warlord = factory.createWarlord();
        beast = factory.createBeast();
        System.out.println(mage);
        System.out.println(warlord);
        System.out.println(beast);

        factory = new HeroFactoryImpl(new OrcMage(), new OrcWarlord(),
                new OrcBeast());
        mage = factory.createMage();
        warlord = factory.createWarlord();
        beast = factory.createBeast();
        System.out.println(mage);
        System.out.println(warlord);
        System.out.println(beast);
    }
}
