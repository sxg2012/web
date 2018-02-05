package com.sxg.web.remote;

/**
 * Created by shaoxiangen 2018/2/5
 */
public interface ChannelHandler {

    /**
     * on channel connected.
     *
     * @param channel channel.
     */
    void connected(Channel channel) throws RemoteException;

    /**
     * on channel disconnected.
     *
     * @param channel channel.
     */
    void disconnected(Channel channel) throws RemoteException;

    /**
     * on message sent.
     *
     * @param channel channel.
     * @param message message.
     */
    void sent(Channel channel, Object message) throws RemoteException;

    /**
     * on message received.
     *
     * @param channel channel.
     * @param message message.
     */
    void received(Channel channel, Object message) throws RemoteException;


    void caught(Channel channel, Throwable exception) throws RemoteException;
}
