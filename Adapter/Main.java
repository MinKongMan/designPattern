package com.company.Design;

import com.company.Design.adapter.*;
import com.company.Design.singleton.SingleEx;
import com.company.Design.singleton.SocketClient;

public class Main {

    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);
        Cleaner cleaner = new Cleaner();

        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);

        connect(airAdapter);
	// write your code here
    }

    // 콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }


}
