package org.bugkillers.pattern.chain;

public class Client {
    public static final void main(String[] arg) {
        ConcreteHandler1 handler1 = new ConcreteHandler1();
        ConcreteHandler2 handler2 = new ConcreteHandler2();
        handler1.setHandler(handler2);
        handler1.setInterestedInRequest(false);

        handler2.setInterestedInRequest(true);
        handler1.handleRequest();
    }
}