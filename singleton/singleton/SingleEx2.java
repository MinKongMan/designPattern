package com.company.Design.singleton;

public class SingleEx2 {
    private SocketClient socketClient;

    public SingleEx2(){
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return socketClient;
    }
}
