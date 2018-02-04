package com.sxg.web.remote.server;

import java.net.Socket;

public class SocketProcessRunnable implements Runnable {

    private Socket socket;

    public SocketProcessRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

    }
}
