package com.github.kodsurfer.mq;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class BrokerServer implements Runnable {

    public static final int SOCKET_PORT = 9999;
    private final Socket socket;

    public BrokerServer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(SOCKET_PORT);
        while (true) {
            BrokerServer brokerServer = new BrokerServer(serverSocket.accept());
            new Thread(brokerServer).start();
        }
    }
}
