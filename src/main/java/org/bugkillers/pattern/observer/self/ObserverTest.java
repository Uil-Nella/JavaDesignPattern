package org.bugkillers.pattern.observer.self;

/**
 * 测试
 */
public class ObserverTest {

	public static void main(String[] args) {

		//创建主题
		Subject sub = new MySubject();

		Observer tom = new ObserverTom();
		Observer jerry = new ObserverJerry();

		//添加观察者
		sub.add(tom);
		sub.add(jerry);
		
		sub.operation();

		//移除tom
		sub.del(tom);

		sub.operation();
	}

}