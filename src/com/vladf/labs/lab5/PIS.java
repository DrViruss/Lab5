package com.vladf.labs.lab5;

import java.util.ArrayList;

public class PIS {
    public PIS(String message, ArrayList<Person> people, float number) {
        this.message = message;
        this.people = people;
        this.number = (int)number;
    }

    @Override
    public String toString() {
        String t= "Persons In Space:\nmessage:\t"+message;
        if(this.message != "success") {
            String pp = "";
            for(int i=0; i<people.size();i++)
                pp += people.get(i).toString();
            return t + "\nammount:\t" + number +"\nList:"+ pp;
        }
        return t;
    }

    private String message;
    private ArrayList < Person > people = new ArrayList < Person > ();
    private int number;

}