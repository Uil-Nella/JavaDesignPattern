/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.bugkillers.pattern.prototype;

public class ElfBeast extends Beast {

    public ElfBeast() {
    }

    public ElfBeast(ElfBeast beast) {
    }

    @Override
    public Beast clone() throws CloneNotSupportedException {
        return new ElfBeast(this);
    }

    @Override
    public String toString() {
        return "Elven eagle";
    }

}