package org.bugkillers.pattern.bridge;

/**
 * Created by liuxinyu on 2016/10/25.
 */
public class SourceSubTwo implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is the second sub!");
    }
}
