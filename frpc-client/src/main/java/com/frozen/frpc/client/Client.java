package com.frozen.frpc.client;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.RpcChannel;

/**
 * @author frozen
 * @since 18-12-5
 **/
public interface Client {

    RpcChannel createRpcChannel();

    RpcChannel createRpcChannel(int timeout);

    BlockingRpcChannel createBlockingRpcChannel();

    BlockingRpcChannel createBlockingRpcChannel(int timeout);

}

