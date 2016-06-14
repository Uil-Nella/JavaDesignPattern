package org.bugkillers.pattern.chain;

/**
 * Created by liuxinyu on 16/6/14.
 */
public class MyHandler {


    public MyHandler handler;


    public void handleRequest() {
        System.out.println("none interested in this request");
    }


    public void setHandler(MyHandler handler) {
        this.handler = handler;
    }

    public MyHandler getHandler() {
        return handler;
    }


}
