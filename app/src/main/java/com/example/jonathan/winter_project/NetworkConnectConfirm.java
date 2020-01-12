package com.example.jonathan.winter_project;

import java.io.*;
import java.net.*;

import static java.lang.Byte.decode;


public class NetworkConnectConfirm {
    static String host = "192.168.4.1";
    //Sending ping to ServerIPGateway

    public static boolean sendPingRequest ()
    {
        boolean isReachable = false;
        try {
            InetAddress ESPGateway = InetAddress.getByName(host);
            isReachable = ESPGateway.isReachable(2000);
        }
        catch (UnknownHostException e){/* add stuff later */}
        catch (IOException I){/* add stuff later */};

        if (isReachable)
        {
            return true;
        }
        else
        {
            return false;
        }

    }



    }

