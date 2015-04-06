/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.bugkillers.pattern.adapter;

/**
 * 对象的适配器
 */
public class ObjectAdapter implements Targetable {

	private Source source;

	public ObjectAdapter(Source source){
		super();
		this.source = source;
	}
	@Override
	public void methodII() {
		System.out.println("this is the targetable method!");
	}

	@Override
	public void method() {
		source.method();
	}
}