package org.bugkillers.pattern.observer.self;


/**
 * 观察者 tom
 */
public class ObserverTom implements Observer {

	@Override
	public void update() {
		System.out.println("tom has received!");
	}
}