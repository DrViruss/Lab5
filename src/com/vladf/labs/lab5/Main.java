package com.vladf.labs.lab5;

import com.alibaba.fastjson.JSON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    private static final String USER_AGENT = "Mozilla/5.0";

    private static final String GET_URL = "https://launchlibrary.net/1.3/launch/next/1";

    public static void main(String[] args) throws IOException {

        //String site = "{\"launches\":[{\"id\":2107,\"name\":\"Falcon 9 Block 5 | Starlink 14\",\"windowstart\":\"October 22, 2020 16:14:00 UTC\",\"windowend\":\"October 22, 2020 16:14:00 UTC\",\"net\":\"October 22, 2020 16:14:00 UTC\",\"wsstamp\":1603383240,\"westamp\":1603383240,\"netstamp\":1603383240,\"isostart\":\"20201022T161400Z\",\"isoend\":\"20201022T161400Z\",\"isonet\":\"20201022T161400Z\",\"status\":1,\"inhold\":0,\"tbdtime\":0,\"vidURLs\":[],\"vidURL\":null,\"infoURLs\":[],\"infoURL\":null,\"holdreason\":null,\"failreason\":null,\"tbddate\":0,\"probability\":50,\"hashtag\":null,\"location\":{\"pads\":[{\"id\":84,\"name\":\"Space Launch Complex 40, Cape Canaveral, FL\",\"infoURL\":\"\",\"wikiURL\":\"https:\\/\\/en.wikipedia.org\\/wiki\\/Cape_Canaveral_Air_Force_Station_Space_Launch_Complex_40\",\"mapURL\":\"http:\\/\\/maps.google.com\\/maps?q=28.56194122,-80.57735736\",\"latitude\":28.56194122,\"longitude\":-80.57735736,\"agencies\":[{\"id\":121,\"name\":\"SpaceX\",\"abbrev\":\"SpX\",\"countryCode\":\"USA\",\"type\":3,\"infoURL\":null,\"wikiURL\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/SpaceX\",\"infoURLs\":[\"http:\\/\\/www.spacex.com\\/\",\"https:\\/\\/twitter.com\\/SpaceX\",\"https:\\/\\/www.youtube.com\\/channel\\/UCtI0Hodo5o5dUb67FeUjDeA\"]}]}],\"id\":16,\"name\":\"Cape Canaveral, FL, USA\",\"infoURL\":\"\",\"wikiURL\":\"\",\"countryCode\":\"USA\"},\"rocket\":{\"id\":188,\"name\":\"Falcon 9 Block 5\",\"configuration\":\"9 Block 5\",\"familyname\":\"Falcon\",\"agencies\":[{\"id\":121,\"name\":\"SpaceX\",\"abbrev\":\"SpX\",\"countryCode\":\"USA\",\"type\":3,\"infoURL\":null,\"wikiURL\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/SpaceX\",\"infoURLs\":[\"http:\\/\\/www.spacex.com\\/\",\"https:\\/\\/twitter.com\\/SpaceX\",\"https:\\/\\/www.youtube.com\\/channel\\/UCtI0Hodo5o5dUb67FeUjDeA\"]}],\"wikiURL\":\"https:\\/\\/en.wikipedia.org\\/wiki\\/Falcon_9_Full_Thrust#Block_5\",\"infoURLs\":[\"http:\\/\\/www.spacex.com\\/falcon9\"],\"infoURL\":\"http:\\/\\/www.spacex.com\\/falcon9\",\"imageSizes\":[320,480,640,720,768,800,960,1024,1080,1280,1440,1920],\"imageURL\":\"https:\\/\\/launchlibrary1.nyc3.digitaloceanspaces.com\\/RocketImages\\/Falcon9Block5.jpg_1920.jpg\"},\"missions\":[{\"id\":1359,\"name\":\"Starlink 14\",\"description\":\"A batch of 60 satellites for Starlink mega-constellation - SpaceX's project for space-based Internet communication system.\",\"type\":10,\"typeName\":\"Communications\",\"agencies\":[{\"id\":121,\"name\":\"SpaceX\",\"abbrev\":\"SpX\",\"countryCode\":\"USA\",\"type\":3,\"infoURL\":null,\"wikiURL\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/SpaceX\",\"infoURLs\":[\"http:\\/\\/www.spacex.com\\/\",\"https:\\/\\/twitter.com\\/SpaceX\",\"https:\\/\\/www.youtube.com\\/channel\\/UCtI0Hodo5o5dUb67FeUjDeA\"]}]}],\"lsp\":{\"id\":121,\"name\":\"SpaceX\",\"abbrev\":\"SpX\",\"countryCode\":\"USA\",\"type\":3,\"infoURL\":null,\"wikiURL\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/SpaceX\",\"infoURLs\":[\"http:\\/\\/www.spacex.com\\/\",\"https:\\/\\/twitter.com\\/SpaceX\",\"https:\\/\\/www.youtube.com\\/channel\\/UCtI0Hodo5o5dUb67FeUjDeA\"]}}],\"total\":197,\"offset\":0,\"count\":1}";
        String ll = "{\"id\":2101,\"name\":\"Electron | In Focus\",\"windowstart\":\"October 21, 2020 21:14:00 UTC\",\"windowend\":\"October 21, 2020 22:03:00 UTC\",\"net\":\"October 21, 2020 21:14:00 UTC\",\"wsstamp\":1603314840,\"westamp\":1603317780,\"netstamp\":1603314840,\"isostart\":\"20201021T211400Z\",\"isoend\":\"20201021T220300Z\",\"isonet\":\"20201021T211400Z\",\"status\":1,\"inhold\":0,\"tbdtime\":0,\"vidURLs\":[],\"vidURL\":null,\"infoURLs\":[],\"infoURL\":null,\"holdreason\":null,\"failreason\":null,\"tbddate\":0,\"probability\":-1,\"hashtag\":null,\"location\":{\"pads\":[{\"id\":166,\"name\":\"Rocket Lab Launch Complex 1A\",\"infoURL\":\"\",\"wikiURL\":\"https:\\/\\/en.wikipedia.org\\/wiki\\/Rocket_Lab_Launch_Complex_1\",\"mapURL\":\"https:\\/\\/www.google.com\\/maps\\/place\\/-39.262833,177.864469\",\"latitude\":-39.262833,\"longitude\":177.864469,\"agencies\":[{\"id\":147,\"name\":\"Rocket Lab Ltd\",\"abbrev\":\"RL\",\"countryCode\":\"USA\",\"type\":3,\"infoURL\":null,\"wikiURL\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Rocket_Lab\",\"infoURLs\":[\"http:\\/\\/www.rocketlabusa.com\\/\",\"https:\\/\\/twitter.com\\/rocketlab\",\"https:\\/\\/www.youtube.com\\/user\\/RocketLabNZ\",\"https:\\/\\/www.facebook.com\\/RocketLabUSA\",\"https:\\/\\/www.linkedin.com\\/company\\/rocket-lab-limited\"]}]}],\"id\":40,\"name\":\"Onenui Station, Mahia Peninsula, New Zealand\",\"infoURL\":\"\",\"wikiURL\":\"\",\"countryCode\":\"NZL\"},\"rocket\":{\"id\":148,\"name\":\"Electron\",\"configuration\":\"\",\"familyname\":\"Electron\",\"agencies\":[{\"id\":147,\"name\":\"Rocket Lab Ltd\",\"abbrev\":\"RL\",\"countryCode\":\"USA\",\"type\":3,\"infoURL\":null,\"wikiURL\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Rocket_Lab\",\"infoURLs\":[\"http:\\/\\/www.rocketlabusa.com\\/\",\"https:\\/\\/twitter.com\\/rocketlab\",\"https:\\/\\/www.youtube.com\\/user\\/RocketLabNZ\",\"https:\\/\\/www.facebook.com\\/RocketLabUSA\",\"https:\\/\\/www.linkedin.com\\/company\\/rocket-lab-limited\"]}],\"wikiURL\":\"https:\\/\\/en.wikipedia.org\\/wiki\\/Electron_(rocket)\",\"infoURLs\":[\"https:\\/\\/www.rocketlabusa.com\\/electron\\/\"],\"infoURL\":\"https:\\/\\/www.rocketlabusa.com\\/electron\\/\",\"imageSizes\":[320,480,640,720,768,800,960,1024,1080,1280,1440],\"imageURL\":\"https:\\/\\/launchlibrary1.nyc3.digitaloceanspaces.com\\/RocketImages\\/Electron.jpg_1440.jpg\"},\"missions\":[{\"id\":1357,\"name\":\"In Focus\",\"description\":\"\\\"In Focus\\\" is a rideshare mission carrying 10 Earth observation satellites for Planet and Canon Electronics.\",\"type\":14,\"typeName\":\"Dedicated Rideshare\",\"agencies\":null}],\"lsp\":{\"id\":147,\"name\":\"Rocket Lab Ltd\",\"abbrev\":\"RL\",\"countryCode\":\"USA\",\"type\":3,\"infoURL\":null,\"wikiURL\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Rocket_Lab\",\"infoURLs\":[\"http:\\/\\/www.rocketlabusa.com\\/\",\"https:\\/\\/twitter.com\\/rocketlab\",\"https:\\/\\/www.youtube.com\\/user\\/RocketLabNZ\",\"https:\\/\\/www.facebook.com\\/RocketLabUSA\",\"https:\\/\\/www.linkedin.com\\/company\\/rocket-lab-limited\"]}}";
        Launch i = JSON.parseObject(ll,Launch.class);

        System.out.println("ff");
        //sendHttpGETRequest();
    }

    private static void sendHttpGETRequest() throws IOException {
        URL obj = new URL(GET_URL);
        HttpURLConnection httpURLConnection = (HttpURLConnection) obj.openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = httpURLConnection.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == 200) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in .readLine()) != null) {
                response.append(inputLine);
            } in .close();
//
//            Launch i = JSON.parseObject(response.toString(),Launch.class);

            // print result
            System.out.println(response.toString());}
         else {
            System.out.println("GET request not worked");
        }

        for (int i = 1; i <= 8; i++) {
            System.out.println(httpURLConnection.getHeaderFieldKey(i) + " = " + httpURLConnection.getHeaderField(i));
        }

    }
}
