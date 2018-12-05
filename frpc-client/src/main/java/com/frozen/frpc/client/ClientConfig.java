package com.frozen.frpc.client;

/**
 * @author frozen
 * @since 18-12-5
 **/
public class ClientConfig {
    private final ClientType ClientType;

    private ClientConfig(Builder builder) {
        this.ClientType = builder.clientType;
    }

    public ClientType getClientType() {
        return ClientType;
    }

    public static class Builder {
        private ClientType clientType;

        public Builder ClientType(ClientType clientType) {
            this.clientType = clientType;
            return this;
        }

        public ClientConfig builder() {
            return new ClientConfig(this);
        }

    }

}
