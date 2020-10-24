package com.vladf.labs.lab5;

import com.alibaba.fastjson.JSON;
import com.vladf.labs.lab5.data.PIS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    private static final String USER_AGENT = "Mozilla/5.0";

    private static final String GET_URL = "http://api.open-notify.org/astros.json";

    public static void main(String[] args) throws IOException {

        URL obj = new URL(GET_URL);
        HttpURLConnection httpURLConnection = (HttpURLConnection) obj.openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in .readLine()) != null) {
                response.append(inputLine);
            } in .close();

            PIS t = JSON.parseObject(response.toString(),PIS.class);

            System.out.println(t);}
        else {
            System.out.println("GET request not worked");
        }

        String tmp="";
        for (int i = 1; i <= 8; i++) {
           tmp+=httpURLConnection.getHeaderFieldKey(i) + " = " + httpURLConnection.getHeaderField(i)+"\n";
        }

        String finalTmp = tmp;
        Informator op = (something)-> "\nHTTPConnection info:\nGET Response Code = " + responseCode+ finalTmp;
        System.out.println(op.s(responseCode));

        /*
        * System.out.println("\nHTTPConnection info:");
        * System.out.println("GET Response Code = " + responseCode);
        *  for (int i = 1; i <= 8; i++) {
        *     System.out.println(httpURLConnection.getHeaderFieldKey(i) + " = " + httpURLConnection.getHeaderField(i));
        * }
        */
    }
}
interface Informator {
    String s (int responseCode );
}
