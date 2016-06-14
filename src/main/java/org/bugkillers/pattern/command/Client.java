package org.bugkillers.pattern.command;

/**
 * Created by liuxinyu on 16/6/14.
 */
public class Client {


    public static void main(String[] args) {
        Receiver receiver = new Receiver();


        Command command = new OneCommand(receiver);


        Invoker invoker = new Invoker(command);

        invoker.action();
    }
}
