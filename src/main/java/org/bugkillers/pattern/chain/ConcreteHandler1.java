package org.bugkillers.pattern.chain;

public class ConcreteHandler1 extends MyHandler {
    private boolean interestedInRequest;

    @Override
    public void handleRequest() {
        if (interestedInRequest) {
            System.out.println("ConcreteHandler1 handles Request");
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