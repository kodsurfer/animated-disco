package com.github.kodsurfer.mq;

import java.net.Socket;

public class BrokerServer implements Runnable {

    public static final int PORT = 9999;
    private final Socket socket;

    public BrokerServer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

    }
}
