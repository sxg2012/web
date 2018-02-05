package com.sxg.web.remote.server;

import com.sxg.web.remote.MessageHandler;
import com.sxg.web.remote.RemoteMessage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class SocketProcessRunnable implements Runnable {

    private Socket socket;
    private Server server;
    private MessageHandler messageHandler;

    public SocketProcessRunnable(Socket socket,Server server) {
        this.socket = socket;
        this.server = server;
    }

    @Override
    public void run() {
        try {
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Object receiveMsg = ois.readObject();
            if(receiveMsg instanceof RemoteMessage) {
                process((RemoteMessage)receiveMsg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void process(RemoteMessage remoteMessage) {
    }
}
