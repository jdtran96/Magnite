package com.example.jonathan.winter_project;

import android.os.AsyncTask;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class fetchData extends AsyncTask<Void,Void,Void>{
String data = "";
public static String onCondition = "";
public static String offCondition = "";
String jsonstring = "";
    @Override
    protected Void doInBackground(Void... voids) {

        try {
            URL url = new URL("https://api.myjson.com/bins/7i61c");                            //To access JSON file for editing, URL = http://myjson.com/7i61c (out of date, need to update hosting website)

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line = "";
            while(line != null)
            {
                line = bufferedReader.readLine();
                data = data + line;
            }

            try {
                JSONObject jsonObject = new JSONObject(this.data);
                onCondition = jsonObject.getString("test1");
                offCondition = jsonObject.getString("test2");
            } catch (JSONException e) {
                e.printStackTrace();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        MainPage.data.setText(onCondition);
    }

    public void Process_two() { MainPage.data.setText(offCondition); }
}
