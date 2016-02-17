package org.bugkillers.pattern.observer.self;

/**
 * 具体的主题
 */
public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		System.out.println("operation self!");
		notifyObservers();
	}

}