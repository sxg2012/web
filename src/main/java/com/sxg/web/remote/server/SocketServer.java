package com.sxg.web.remote.server;

import com.sxg.web.WebApplication;
import com.sxg.web.remote.RemoteException;
import com.sxg.web.remote.factory.ServerThreadFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;


/**
 * Created by shaoxiangen 2018/2/3
 */
public class SocketServer implements Server {

    private Logger LOG = LoggerFactory.getLogger(SocketServer.class);
    private int port;
    private ServerSocket serverSocket;
    private volatile boolean started;
    private ExecutorService executorService;
    private ThreadFactory threadFactory;

    @Override
    public void init() throws IOException {
        serverSocket = new ServerSocket(port);
        threadFactory = new ServerThreadFactory();
        executorService = Executors.newFixedThreadPool(20,threadFactory);
    }

    @Override
    public void start() throws RemoteException {
        if(started)
            throw new RemoteException("Server has started!");
        started = true;
        for(;;) {
            try {
                executorService.execute(new SocketProcessRunnable(serverSocket.accept()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void stop() {

    }
}
