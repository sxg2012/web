package com.sxg.web.remote.server;

import com.sxg.web.remote.RemoteException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by shaoxiangen 2018/2/3
 */
public class DelegateServer implements Server{

    private Logger LOG = LoggerFactory.getLogger(DelegateServer.class);

    private Server server;

    @Override
    public void init() {
        try {
            server.init();
        } catch (IOException e) {
            // TODO
        }
    }

    @Override
    public void start() {
        try {
            server.start();
        } catch (RemoteException e) {
            // TODO
        }
    }

    @Override
    public void stop() {
        server.stop();
    }
}
