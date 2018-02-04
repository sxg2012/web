package com.sxg.web.remote.server;

import com.sxg.web.remote.RemoteException;

import java.io.IOException;

/**
 * Created by shaoxiangen 2018/2/3
 */
public interface Server {

    void init() throws IOException;
    void start() throws RemoteException;
    void stop();
}
