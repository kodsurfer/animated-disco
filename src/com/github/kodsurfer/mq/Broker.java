package com.github.kodsurfer.mq;

import java.util.concurrent.ArrayBlockingQueue;

public class Broker {
    private final static int SIZE_MAX = 10;
    private static ArrayBlockingQueue<String> mq = new ArrayBlockingQueue<>(SIZE_MAX);


    public static void produce(String msg) {
        if (mq.offer(msg))
            System.out.println("Send message to message broker: " + msg + " current cache: " + mq.size());
        else
            System.out.println("Message can't be send");
    }
}
