package org.bugkillers.pattern.bridge;

public class BridgeTest {

    public static void main(String[] args) {

        Bridge bridge = new MyBridge();

		/*调用第一个对象*/
        Sourceable source1 = new SourceSubOne();
        bridge.setSource(source1);
        bridge.method();
		
		/*调用第二个对象*/
        Sourceable source2 = new SourceSubTwo();
        bridge.setSource(source2);
        bridge.method();
    }
}