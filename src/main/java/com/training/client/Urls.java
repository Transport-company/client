package com.training.client;

public interface Urls {
    String ROOT = "";

    interface Tracking {
        String PART = "tracking";
        String FULL = ROOT + "/" + PART;
    }

    interface Message {
        String PART = "message";
        String FULL = ROOT + "/" + PART;
    }
}
