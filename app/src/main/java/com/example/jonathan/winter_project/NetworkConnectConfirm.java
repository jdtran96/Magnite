package com.example.jonathan.winter_project;

import android.os.AsyncTask;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class NetworkConnectConfirm extends AsyncTask<Void,Void,Void> {

    static String host = "192.168.4.1";
    //Sending ping to ServerIPGateway
    String holder = "";

    public boolean reachableEXT = false;

    @Override
    protected Void doInBackground(Void... voids) {

          boolean isReachable = false;
            try {
                InetAddress ESPGateway = InetAddress.getByName(host);
                isReachable = ESPGateway.isReachable(2000);
            }
            catch (UnknownHostException e){/* add stuff later */}
            catch (IOException I){/* add stuff later */};

            if (isReachable)
            {
                holder = "Server Successfully Connected!";
            }
            else
            {
                holder = "Server not connected. Please connect to the ESP WiFi Server and try again";
            }
            return null;

    }


    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        MainPage.CNCTConfirmText.setText(holder);
    }
}

