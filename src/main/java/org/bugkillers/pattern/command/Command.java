package org.bugkillers.pattern.command;

/**
 * Created by liuxinyu on 16/6/14.
 */
public interface Command {

    void execute();


    void undo();
}
