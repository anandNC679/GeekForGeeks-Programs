package com.thread;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;

/**
 * author anand.
 * since on 24/3/18.
 */

class Message{
    public volatile String msg;

    public Message(String msg) {
        this.msg=msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

class Waiter implements Runnable{

    @Override
    public void run() {

    }
}

class Notifier implements Runnable{
    @Override
    public void run() {

    }
}
public class ThreadWaitandSleepDemo {
}
