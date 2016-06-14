package org.bugkillers.pattern.command;

/**
 * Created by liuxinyu on 16/6/14.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
