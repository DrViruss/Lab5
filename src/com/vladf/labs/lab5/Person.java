package com.vladf.labs.lab5;

public class Person {
        public Person(String name, String craft) {
            this.name = name;
            this.craft = craft;
        }

        @Override
        public String toString() {
            return "\n-Person:\nname:\t"+name+"\ncraft:\t"+craft;
        }

        private String name;
        private String craft;
}
