package com.sxg.web.remote;

import java.net.InetSocketAddress;

/**
 * Created by shaoxiangen 2018/2/5
 */
public interface Channel {

    InetSocketAddress getRemoteAddress();

    boolean isConnected();

    boolean hasAttribute(String key);

    Object getAttribute(String key);

    void setAttribute(String key, Object value);

    void removeAttribute(String key);
}
