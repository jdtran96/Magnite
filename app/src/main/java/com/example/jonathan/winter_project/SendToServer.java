package com.example.jonathan.winter_project;

import android.os.AsyncTask;
import android.widget.EditText;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class SendToServer extends AsyncTask<Void, Void, Void> {

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    OkHttpClient okHttpClient = new OkHttpClient();

    public String post(String url, String json) throws IOException{
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = okHttpClient.newCall(request).execute()) {
            return response.body().string();
        }
    }

   public String Wifi_Submit(EditText SSID, EditText Password)
   {
       return "{'Network Name:'" + SSID +
               "'Network PW:'" + Password +"}";
   }
   public String Wifi_Submit_SSID(EditText SSID)
   {
       return "{Network Name:'" + SSID + "}";
   }

   public String Wifi_Submit_PW(EditText Password)
   {
       return "{Network PW:'" + Password + "}";
   }


    @Override
    protected Void doInBackground(Void... voids) {

        try {
            post(WiFi_Connection.jsonex,WiFi_Connection.jsonex1);
            String response = WiFi_Connection.example.post("http://192.168.4.1/" + WiFi_Connection.action, (WiFi_Connection.jsonex + WiFi_Connection.jsonex1));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        WiFi_Connection.Post_Result.setText("test completed");

    }
}


