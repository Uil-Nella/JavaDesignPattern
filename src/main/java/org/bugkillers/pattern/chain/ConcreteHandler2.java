package org.bugkillers.pattern.chain;

public class ConcreteHandler2 extends MyHandler {
    private boolean interestedInRequest;

    @Override
    public void handleRequest() {
        if (interestedInRequest) {
            System.out.println("ConcreteHandler2 handles Request");
        } else {
            if ((getHandler() != null)) {
                getHandler().handleRequest();
            } else {
                super.handleRequest();
            }


        }
    }

    public void setInterestedInRequest(boolean interestedInRequest) {
        this.interestedInRequest = interestedInRequest;

    }

    public boolean getIsInterestedInRequest() {
        return interestedInRequest;
    }

}