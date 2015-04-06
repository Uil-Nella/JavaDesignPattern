/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.bugkillers.pattern.prototype;

/**
 * 
 * Concrete factory class.
 * 
 */
public class HeroFactoryImpl implements HeroFactory {

	private Mage mage;
	private Warlord warlord;
	private Beast beast;

	public HeroFactoryImpl(Mage mage, Warlord warlord, Beast beast) {
		this.mage = mage;
		this.warlord = warlord;
		this.beast = beast;
	}

	public Mage createMage() {
		try {
			return mage.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public Warlord createWarlord() {
		try {
			return warlord.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public Beast createBeast() {
		try {
			return beast.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

}