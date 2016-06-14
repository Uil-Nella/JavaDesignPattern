package org.bugkillers.pattern.command;

/**
 * Created by liuxinyu on 16/6/14.
 */
public class OneCommand implements Command {

    private Receiver receiver;

    public OneCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
        System.out.println("执行第一个命令");
    }

    @Override
    public void undo() {
        receiver.action();
        System.out.println("取消第一个命令");
    }
}
