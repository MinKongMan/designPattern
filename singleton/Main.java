package com.company.Design;

import com.company.Design.singleton.SingleEx;
import com.company.Design.singleton.SocketClient;

public class Main {

    public static void main(String[] args) {
        SingleEx a = new SingleEx();
        SingleEx b = new SingleEx();

        SocketClient ac = a.getSocketClient();
        SocketClient bc = b.getSocketClient();


        System.out.println("두 객체가 동일한가?");
        System.out.println(ac.equals(bc));
	// write your code here
    }
}
