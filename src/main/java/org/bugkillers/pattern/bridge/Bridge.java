package org.bugkillers.pattern.bridge;

/**
 * Created by liuxinyu on 2016/10/25.
 */
public abstract class Bridge {
    private Sourceable source;


    public void method(){
        method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
