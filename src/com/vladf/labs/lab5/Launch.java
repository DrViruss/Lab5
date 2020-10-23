package com.vladf.labs.lab5;

import java.util.ArrayList;

public class Launch {
        private float id;
        private String name;
        private float status;
        private float inhold;
        private float tbdtime;
        private String vidURL;
        private String infoURL;
        Location LocationObject;
        Rocket RocketObject;
        ArrayList < Object > missions = new ArrayList < Object > ();
        Lsp LspObject;
        private String holdreason;
        private String failreason;

    public Launch(float id, String name, float status, float inhold, float tbdtime, String vidURL, String infoURL, Location locationObject, Rocket rocketObject, ArrayList<Object> missions, Lsp lspObject, String holdreason, String failreason) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.inhold = inhold;
        this.tbdtime = tbdtime;
        this.vidURL = vidURL;
        this.infoURL = infoURL;
        LocationObject = locationObject;
        RocketObject = rocketObject;
        this.missions = missions;
        LspObject = lspObject;
        this.holdreason = holdreason;
        this.failreason = failreason;
    }

// Getter Methods

        public float getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public float getStatus() {
            return status;
        }

        public float getInhold() {
            return inhold;
        }

        public float getTbdtime() {
            return tbdtime;
        }

        public String getVidURL() {
            return vidURL;
        }

        public String getInfoURL() {
            return infoURL;
        }

        public Location getLocation() {
            return LocationObject;
        }

        public Rocket getRocket() {
            return RocketObject;
        }

        public Lsp getLsp() {
            return LspObject;
        }

    }
    class Lsp {
        public Lsp(float id, String name, String abbrev, String countryCode, float type, String infoURL, String wikiURL) {
            this.id = id;
            this.name = name;
            this.abbrev = abbrev;
            this.countryCode = countryCode;
            this.type = type;
            this.infoURL = infoURL;
            this.wikiURL = wikiURL;
        }

        private float id;
        private String name;
        private String abbrev;
        private String countryCode;
        private float type;
        private String infoURL = null;
        private String wikiURL;


        // Getter Methods 

        public float getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getAbbrev() {
            return abbrev;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public float getType() {
            return type;
        }

        public String getInfoURL() {
            return infoURL;
        }

        public String getWikiURL() {
            return wikiURL;
        }

    }
    class Rocket {
        public Rocket(String name, String wikiURL, String infoURL, String imageURL) {
            this.name = name;
            this.wikiURL = wikiURL;
            this.infoURL = infoURL;
            this.imageURL = imageURL;
        }

        private String name;
        private String wikiURL;
        private String infoURL;
        private String imageURL;


        // Getter Methods

        public String getName() {
            return name;
        }

        public String getWikiURL() {
            return wikiURL;
        }

        public String getInfoURL() {
            return infoURL;
        }

        public String getImageURL() {
            return imageURL;
        }

    }
    class Location {
       // ArrayList <  > pads = new ArrayList < Object > ();
        private String name;
        private String infoURL;
        private String wikiURL;


        // Getter Methods 


        public String getName() {
            return name;
        }

        public String getInfoURL() {
            return infoURL;
        }

        public String getWikiURL() {
            return wikiURL;
        }

        public Location(String name, String infoURL, String wikiURL) {
            this.name = name;
            this.infoURL = infoURL;
            this.wikiURL = wikiURL;
        }
    }
