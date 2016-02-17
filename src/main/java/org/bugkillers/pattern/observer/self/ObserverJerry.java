package org.bugkillers.pattern.observer.self;

/**
 * 观察者jerry
 */
public class ObserverJerry implements Observer {

	@Override
	public void update() {
		System.out.println("Jerry has received!");
	}

}