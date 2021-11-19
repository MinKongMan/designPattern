package com.company.Design.singleton;

public class SocketClient {

    private static SocketClient socketClient = null;

    private SocketClient(){

    } // private으로 막아놨음

    public static SocketClient getInstance(){

        if(socketClient == null){ // 없는 경우 생성
            socketClient = new SocketClient();
        }
        return socketClient; // 있는 경우 있는거 리턴

    }

    public void connect(){
        System.out.println("Connect");
    }
}
